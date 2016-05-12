param Pathlength;

var dadosValidos{0..Pathlength} : integer >=0, <= 1 := 1;

set 71ma802lud8ca within {0..Pathlength} default {};

set 7qfe0h84vfr9u within {0..Pathlength} default {};

set 1q42m3hei4rmd within {0..Pathlength} default {};

set a6mi6upa60crs within {0..Pathlength} default {};

set sr3e4ol30n03 within {0..Pathlength} default {};

set 8c7qnidemuc9c within {0..Pathlength} default {};
s.t. 8c7qnidemuc9c_pre0{i in 8c7qnidemuc9c} : (dadosValidos[i])=(0);


set 76d5fjp1kpl1h within {0..Pathlength} default {};
s.t. 76d5fjp1kpl1h_pre0{i in 76d5fjp1kpl1h} : (dadosValidos[i])=(1);



set MaquinaEstadosGerenciamentoDeItem_Region1_ListandoItem within {0..Pathlength} default {};
s.t. MaquinaEstadosGerenciamentoDeItem_Region1_ListandoItem_invariant{i in MaquinaEstadosGerenciamentoDeItem_Region1_ListandoItem} : (estado[i])=();


