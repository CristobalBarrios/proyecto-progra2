/**
 * Author:  Grupo
 * Created: 3 de oct. de 2024
 */

-- USUARIO PRINCIPAL (FUNCIÓN: ESQUEMA)
CREATE USER "PROYECTO" IDENTIFIED BY "proyecto"  ;

-- ROLES
GRANT "CONNECT" TO "PROYECTO" ;
GRANT "RESOURCE" TO "PROYECTO" ;
GRANT "DBA" TO "PROYECTO" ;