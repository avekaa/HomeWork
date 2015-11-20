# HomeWork

## Programmi nõuded

### Eesmärk
Ma tahan et programm võimaldaks planeerida eelmise perioodi andmete alusel järgneva perioodi eelarvet, selleks, et ma ei peaks seda tegema käsitsi excelis.

### Nõuete kriteeriumid

* Ma pean saama valida ametiliiki
* Ma pean saama valida struktuuriüksuse
* Ma pean saama teha ametiliigi ja struktuuriüksuse valikut suvalises järjekorras
* Ma pean saama kinnitada oma valikut või alustada uuesti otsast
* Ma pean saama valida tasuliigid mis kehtivad sellele struktuuriüksusele 
* Ma pean saama valida "Alusta planeerimist" 
* Ma pean saama valida hõive, seejärel programm pakub kahte valikut keskmine või seis
* Ma pean saama valida esimese tasuliigi, millest alustan planeerimist
* Tasuliikide planeerimine, valin tasuliigi: 
	* Põhitasu planeerimisel ma pean saama valida tunnitasu või põhitasu. Programm pakub kasutajale tasuliigi planeerimisel "Planeerimise alus: Põhitasu või Tunnitasu" seejärel "Sisesta allüksuse kuine põhitasu või tunnitasu"
		* Tunnitasu valikul saan sisestada allüksuse tunnitasu. Programm küsib arvuta tulemus valikud JAH/EI. 
		Seejärel toimub arvutus tunnitasu * iga kuu normtundide arv * hõive ning vastav tulemus arvutatakse kuude peale ning kokku lahtris programm summeerib tulemuse
		* Põhitasu valikul küsib programm sisesta allüksuse põhitasud kokku. Programm küsib arvuta tulemus valikud JAH/EI. Programm sisestab vastava info igale kuule ning summeerib tulemuse kokku lahtrisse
	* Lisatasude planeerimisel ma pean saama sisestada kuise lisatasude summa. Programm sisestab vastava summa igasse kuusse ning summeerib tulemuse kokku lahtrisse
	* Muude tasude planeerimisel pean ma saama sisestada muude tasude kuise summa. Programm sisestab vastava summa igasse kuusse ning summeerib tulemuse kokku lahtrisse
* Ma pean saama valida arvuta tasuliigid kokku. Programm summeerib tasuliikide summad kuude lõikes ja kokku
* Ma pean saama valida arvuta kokku maksudega. Programm korrutab kokku kuised summad kehtiva maksumääraga. 
* Ma pean saama valida võrdle tulemust eelmise perioodi tegelikuga. Programm võrdleb planeeritud tulemust eelmise perioodi tegelikuga (abs ja %)
		
### Eeldused:
* Planeerimisperiood on alati järgnev aasta
* Maksimaalne tasuliikide arv on 5
* Planeerimisel on toodud info kuude lõikes ja kokku
* Planeerimisel toodud eelmise perioodi tegelikud kulud tasuliikide lõikes kokku
* Planeerimisel on programmis info planeeritava perioodi norm tööpäevade, riiklike pühade ja kuude lõikes töötundide kohta 
