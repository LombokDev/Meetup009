%title: Lombok{DEV} - Android Developer Guide to develop REST API: The easy way.
%author: t.me/hayinukman  hayi.nkm@gmail.com
%date: 2020-05-05

-> Bismillah... <- 
---------

888    888       d88888888888b. 8888888b.Y88b   d88P 
888    888      d88888888   Y88b888   Y88bY88b d88P  
888    888     d88P888888    888888    888 Y88o88P   
8888888888    d88P 888888   d88P888   d88P  Y888P    
888    888   d88P  8888888888P" 8888888P"    888     
888    888  d88P   888888       888          888     
888    888 d8888888888888       888          888     
888    888d88P     888888       888          888     


8888888b.                                               888   888
888   Y88b                                              888   888
888    888                                              888   888
888   d88P    8888b.    88888b.d88b.     8888b.     .d88888   88888b.     8888b.    88888b.
8888888P"        "88b   888 "888 "88b       "88b   d88" 888   888 "88b       "88b   888 "88b
888 T88b     .d888888   888  888  888   .d888888   888  888   888  888   .d888888   888  888
888  T88b    888  888   888  888  888   888  888   Y88b 888   888  888   888  888   888  888
888   T88b   "Y888888   888  888  888   "Y888888    "Y88888   888  888   "Y888888   888  888


--------------------------

888    d8P               888      888   d8b
888   d8P                888      888   Y8P
888  d8P                 888      888
888d88K        .d88b.    888888   888   888   88888b.
8888888b      d88""88b   888      888   888   888 "88b
888  Y88b     888  888   888      888   888   888  888
888   Y88b    Y88..88P   Y88b.    888   888   888  888
888    Y88b    "Y88P"     "Y888   888   888   888  888

*_CARA GAMPANG BIKIN REST API_*
terutama untuk para Android Developer

-------------------------------------------------

d8b              888
Y8P              888
                 888
888   88888b.    888888   888d888    .d88b.
888   888 "88b   888      888P"     d88""88b
888   888  888   888      888       888  888
888   888  888   Y88b.    888       Y88..88P
888   888  888    "Y888   888        "Y88P"

nama          *Hayi Nukman*
contact       *_t.me/hayinukman_*
email         *_hayi.nkm@gmail.com_*

-------------------------------------------------


888    d8P               888      888   d8b
888   d8P                888      888   Y8P
888  d8P                 888      888
888d88K        .d88b.    888888   888   888   88888b.
8888888b      d88""88b   888      888   888   888 "88b
888  Y88b     888  888   888      888   888   888  888
888   Y88b    Y88..88P   Y88b.    888   888   888  888
888    Y88b    "Y88P"     "Y888   888   888   888  888

888888888888888888888888888888888888888888888888888888

Kotlin untuk Android ==> *Udah biasa*
Kotlin untuk Web Front End ==> ??? 
Kotlin untuk Web Backe End ==> ???

-------------------------------------------------

-> The Problem <- 

_GIVEN_ `Freelance Android developer.`

_WHEN_ `Deadline dah mepet` _AND_ `Backend kaga kelar2` _OR_ `Backend Developer Ngilang`

_CONSIDER_ `Learning New Language untuk Backend` tapi `Deadline mepet`

_THEN_ *Why not use Kotlin for Backend?*

------------------------

-> The Framework Choices <-
-> | <-
-> ktor.io <-

888    d8P    888
888   d8P     888
888  d8P      888
888d88K       888888    .d88b.    888d888
8888888b      888      d88""88b   888P"
888  Y88b     888      888  888   888
888   Y88b    Y88b.    Y88..88P   888
888    Y88b    "Y888    "Y88P"    888


kelebihan:
- enak buat server side rendering web
- html DSL nya magic banget, bisa bikin DSL sendiri loh, misal DSL buat Bootstrap, Vue, react, atau lainnya...


----------------

-> The Framework Choices (2) <-
-> | <-
-> javalin.io <-

  888888                                    888   d8b
    "88b                                    888   Y8P
     888                                    888
     888    8888b.    888  888    8888b.    888   888   88888b.
     888       "88b   888  888       "88b   888   888   888 "88b
     888   .d888888   Y88  88P   .d888888   888   888   888  888
     88P   888  888    Y8bd8P    888  888   888   888   888  888
     888   "Y888888     Y88P     "Y888888   888   888   888  888
   .d88P
 .d88P"
888P"

kelebihan:
- ringan aka lightweight
- ibaratnya, klo Ktor diibaratin djanggo, javalin nih flask nya. 

----------------

-> Least but not Last <-
-> | <- 
-> spring.io <-

 .d8888b.                         d8b
d88P  Y88b                        Y8P
Y88b.
 "Y888b.     88888b.    888d888   888   88888b.     .d88b.
    "Y88b.   888 "88b   888P"     888   888 "88b   d88P"88b
      "888   888  888   888       888   888  888   888  888
Y88b  d88P   888 d88P   888       888   888  888   Y88b 888
 "Y8888P"    88888P"    888       888   888  888    "Y88888
             888                                        888
             888                                   Y8b d88P
             888                                    "Y88P"


Kelebihan:
- Simple
- terlalu banyak magic

--------------

-> Kuy Nyobain Spring <-

-------------

-> Main Spring app Component <-

# Componen Utama
- Spring App
- Controller
  - Mapper
- Exception Handler
- Databases?
  - JPA
    - Entity
    - Repository
- properties

# Optionaly dan must to have untuk Collaboration
- Open Documentation: Swagger Doc.

--------------

-> Enogh Teori, Kuy Praktek <-

--------------

-> LIVE CODING SESSION <-

-------------
-> start.spring.io <-
=============
-------------

-> THE END <- 
============
-> See you next Sharing Session <-


