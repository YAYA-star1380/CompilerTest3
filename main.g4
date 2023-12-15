/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar main;

start:
    prog EOF
    ;

prog: prog   EMAIL | iranNumber;

iranNumber
    : '+98'? '0098'? variation
    ;

variation
    : //nanp
    | gilan
    | tehran
    | khorasan
    | azarbaijan
    ;



areacode
    : DIGIT DIGIT 
    ;

// Exhange
exchange
    : DIGIT DIGIT DIGIT
    ;

// Subscriber
subscriber
    : DIGIT DIGIT DIGIT DIGIT
    ;

numberPhone
    : DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT
    ;

// gilan
gilan
    : '13'  numberPhone
    ;

// tehran
tehran
    : '21'  numberPhone
    ;

// khorasan
khorasan
    : '51'  numberPhone
    ;

// azarbaijan
azarbaijan
    : '41'  numberPhone
    ;
DIGIT
    : [0-9]
    ;

WS
    : [ \r\n]+ -> skip
    ;
EMAIL: LOCAL_SUBPART ('.' LOCAL_SUBPART)* '@' DOMAIN_SUBPART ('.' DOMAIN_SUBPART)+;

fragment LOCAL_SUBPART : [a-zA-Z0-9!$&()*+,;=:_~-]+;
fragment DOMAIN_SUBPART : [a-zA-Z0-9-]+;
