# Euereka
### Wat is eureka?
Eureka is een REST (Representational State Transfer) service. Voornamelijk bedoeld voor het ontdekken/vinden van andere services en load balancing / failover van servers.
	
More basic info can be found [here](https://github.com/Netflix/eureka/wiki/Eureka-at-a-glance)
	
![Screenshot](jeamicro.png)
	
## Architectuur
	
![Screenshot](arch.png)

### Services
De drie services die ik gemaakt heb zijn.

	1. Cars service: aanmaken van autos
	2. Parts: Aanmaken van parts
	3. Location: Communiceert met de cars en parts service voor het opvragen van cars en parts.
	
Tussen de verschillende services wordt gebruik gemaakt van REST calls.
Zo hebben ze allemaal hun eigen domain models waarbij locations deze ook heeft.

### Voordelen en Nadelen

#### Pros

	1. Goede integratie met spring-cloud
	2. Door netflix getest
	3. Service discovery
	4. Failover (if a server fails Eureka will handle this, or so they say)

#### Cons
	
	1. Gemaakt voor spring-cloud (andere optie is een side-car, a.k.a. kleine java applicatie die REST points door geeft/afhandelt).
	2. Higher resource cost because of discovery and failover.
	3. Self-preservation between peers (current state is kept until the other one comes back online)

#### Pro/Con?
	
	1. Configurability of extra nodes/clusters
	2. Regions only know what is in their own instance.
	
### Security
Het beveiligen van de REST calls kun je doen met een SSL certificaat. Hiermee bescherm je jezelf tegen man in the middle attacks. Daarnaast heeft de Eureka server een ingebouwde security systeem, die je makkelijk met een wachtwoord en username kunt configureren. Een andere optie is ook 0Auth, dit zit ingebouwd in spring-cloud.
	
### Scaling

Scaling kun je doen door meerdere instanties te draaien van Eureka servers. Door middel van een cluster kun je je services automatisch verbinden met de minsts drukke server. 
	
