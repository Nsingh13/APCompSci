package Project0;

import java.util.Scanner;

/**
 * Write a description of class Properties here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class Properties {
	// instance variables for l, w, h, weight
	private double length, height, width, weight;
	
	public Properties(double l, double h, double wi, double we) {
		length = l;
		height = h;
		width = wi;
		weight = we;
	}
	

	
	// Pre: Length, Height, Width of the the package
	// Post: The Girth of the package
	public double getGirth() {
		double num1 = length;
		double num2 = height;
		double num3 = width;

		
		//////////////////////////////////////////////////////////////////////////////
		// This block of if is a bubble sort algorithm to sort the side lengths in order from least to greatest
		if (num1 > num2) {
			double placeHolder = num1;
			num1 = num2;
			num2 = placeHolder;
		}
		if (num2 > num3) {
			double placeHolder = num2;
			num2 = num3;
			num3 = placeHolder;
		}
		if (num1 > num2) {
			double placeHolder = num1;
			num1 = num2;
			num2 = placeHolder;
		}

		/////////////////////////////////////////////////////////////////////////////

		// This finds the girth using the two smallest values

		double Girth = (2 * num1) + (2 * num2);
		return Girth;
	}

	// Pre: None
	// Post: return the Weight
	public double getWeight() {
		return weight;
	}
}


/*



  ____     U _____ u     _        _   _            _  __    U _____ u    _         _  __    U _____ u    ____     
 / __"| u  \| ___"|/ U  /"\  u   | \ |"|          |"|/ /    \| ___"|/   |"|       |"|/ /    \| ___"|/ U |  _"\ u  
<\___ \/    |  _|"    \/ _ \/   <|  \| |>         | ' /      |  _|"   U | | u     | ' /      |  _|"    \| |_) |/  
 u___) |    | |___    / ___ \   U| |\  |u       U/| . \\u    | |___    \| |/__  U/| . \\u    | |___     |  _ <    
 |____/>>   |_____|  /_/   \_\   |_| \_|          |_|\_\     |_____|    |_____|   |_|\_\     |_____|    |_| \_\   
  )(  (__)  <<   >>   \\    >>   ||   \\,-.     ,-,>> \\,-.  <<   >>    //  \\  ,-,>> \\,-.  <<   >>    //   \\_  
 (__)      (__) (__) (__)  (__)  (_")  (_/       \.)   (_/  (__) (__)  (_")("_)  \.)   (_/  (__) (__)  (__)  (__) \
  _______   ______  _______         __    __                                             __                 
|       \ |      \|       \       |  \  |  \                                           |  \                
| $$$$$$$\ \$$$$$$| $$$$$$$\      | $$  | $$  ______    ______   ______   ______ ____  | $$____    ______  
| $$__| $$  | $$  | $$__/ $$      | $$__| $$ |      \  /      \ |      \ |      \    \ | $$    \  /      \ 
| $$    $$  | $$  | $$    $$      | $$    $$  \$$$$$$\|  $$$$$$\ \$$$$$$\| $$$$$$\$$$$\| $$$$$$$\|  $$$$$$\
| $$$$$$$\  | $$  | $$$$$$$       | $$$$$$$$ /      $$| $$   \$$/      $$| $$ | $$ | $$| $$  | $$| $$    $$
| $$  | $$ _| $$_ | $$            | $$  | $$|  $$$$$$$| $$     |  $$$$$$$| $$ | $$ | $$| $$__/ $$| $$$$$$$$
| $$  | $$|   $$ \| $$            | $$  | $$ \$$    $$| $$      \$$    $$| $$ | $$ | $$| $$    $$ \$$     \
 \$$   \$$ \$$$$$$ \$$             \$$   \$$  \$$$$$$$ \$$       \$$$$$$$ \$$  \$$  \$$ \$$$$$$$   \$$$$$$$
 
 NyoyyyNNNNNMMMNdo:../oddo+/::+/+/.....-/ss--:----://:+oso+/:-:---:://:-..-ss++oo:/:-.`-/-../:-...-../+-:/:+oo::/:///::---++/oso+:.:/::/:./oydy//+y//o
Nd+....:smNNNMMMMNs-yNMMNN+/sysNm:```.-/+o+:-:://+/::/++++/::::---//:/+/`.syhho+:/o/-.-:..-`-:--/////://////:/o++o++ooo+::::/ooss+.//:---:shhyssos`oy
NNNso+::.-:-/mNNdm/.-:oo+hmNMMNMMo``..-----:///:---`.-:----:///:.---..-.`-yhy////::o/:`..:/`.:/---++o/+/::://::+/--/++o++++--:/o+o/++::/:::-:o+os:-++
NNNNNNNyo++:+/..//.`.+/::ymmmy:+mo.``...-:-..-:-......-:/---////:+s+-...`.:/:--:::::--..-.....--:o+/++/-:/o:////::-..://+oo//osos/:ydssyo+::--/:/osoo
mNNNNNNNNNNddh/--..`.:o:/-:-.-::o/``.```...-----....--.---.:/+o++os/-:----::::-:-:://+/:.`..`.:oooo:-:-../+:.:.---//::::o+os+/oyso++s:+yhs+/-.:/:///+
mmNNNNNNNNNh+:/+ydNmmNNdhdhdmdoss:.`..```----.-..-.....-...-:::::/+/.----::///+/:::-:o+o+-/-..///+s:-//+-...----/:/:/ooo++syyo+yhdh//../:/+o+:/-+:.//
mmmNNNmmm+:+ymNNNNNNMMMMMMMMMMd+yd-`````.://+++:--:--/::.--.``..---..:++/osyyyyys+/:+ssyho:-.---:+o:.+oho.`----://so+++/osoosoossooo/o..:o+oo++++o+os
mmmmNm/--:hNNNNNNNNMMMMMMMMMMh/dMM+`````.-:/oo+:-:+yddo:-/:.:/:/+:`.:osyyysoo+++++oo///oss/`...://-://:+/--:-.-:o+ooo/o+::+oooyso+:..-:`.://-/oos:./:
y/-/o:-:ymNNNNNNNNNNMMMMMMMMs/NMMMh.```..-:+sys+/:ymNNd+-:-.-:--. `/syyo/:---:-:-:/++++/+oo/-`.so/.-:-//::-..-///syss//o::/--/::----:+yo`::/..--+/+o+
yy/./ymNNNNNNNNNNNNMMMMMMMNsomMMMMN/````-:/+yhhs-smNNyoso-::/--` -/o+osss+syyyyooo/////osyo//.`/-..::/+o+/:-.-//:so/os/:///-:::-::/:/oyy` -.-:--::/ys
/-:hNNNNNNNNNNNNNNNMMMMMMNosNMMMMMMd:/:...-:oyo:+ydd/:://:/:..` `-:++sysyhdmmdddddhss+/ossyyo+.-://+/o/+so:--//++/:+sy+:-/:o+:--/++/+o//.`.+:-:-://o-
-sdmmmmNNNNNNNNNNNNNMMMMMssNMMMMMMNs........--..:----.....-.:.``/++osyyyyhhdddmddddhyo//+++sso:/s///:/::-:+:-///++///o+/:--/oo+://///:--..:.-:/--:-.-
hmNmNNNNNNNNNNNNNMMMMMMMmyNMMMMMho/-.......-+/.o::osso+.:/++-`.-++o+ooso+oo++/://///+++/::/oss+::-:+//+-.:/+:-:++oo/-::-/.-:oy+..:--/-.-------+-:/::/
NNNNNNNNNNNNNNNNMMMMNmNdhNNdhhyo:+yo...`..`-sy:dhhdhdmmhmmm+``..//---:--..---.-------...-:/syy/:s++ss/:/:/++s+/+:/+////+o:-:+yo--:.:--://::-+ss/syhy/
NNNNNNNNNMMMMMMMMMNho-+:::-.-+:::://.....``.-/-+:::-/syyyys-``..::-::/shdhssossosyooosyhyssyddo./----`./:o+:/-/o+:++/:/+-:++/ys:-/-..:/osy+s+//o++syy
MNNMMMMMMMMMNNNNNNms+--:-/:/hh-+/+-....`.``.:/--:--::--..`````.-:-/+ohNMMMMMMMMMMMNMMMMMMNmmmmh-:--..:-/+o:.///++::--.-.:/sy/-:..-::/oy+//:so+so:/o+/
mmmmmmddmmmmmddmddddy+ss:+o///:+o:`     ````+y+oyoyy+.`````...-.///+shh+++osyhddNNNMMMMNNNNmmmdooo+:::://:.///oys++-.`.::/o/-:+//+/ohohys+osyyho+/ss/
hhhhhhhyyyssoo++//:----....``````         ``:s/+ooo:.`.......-:`/oo/+yyo/--::..:y:yyhdhhhhdmmNmhhdmmhho:-.-:/oooo/:--.--.-+yhssy+:/syyddhy//++sooos++
/::::::::::::::::--:::-----..``       ```.-:/+//+/:---...-:://:`:+o+/+ssss+:.-`-+-+shdms+ohmNNmdmmmmNmdo/:::/+/:/++:::/-:/hdmysysoo+yydmmmyo:/---:so:
```````````...-..........```` ``  `````.-:oyhhyyso/:--:/+ooo+oo-:++:/:/ooo+:../--++smNd++oydmmddmmmmmmds/://+:.-.-..-:++/:++syhssysoohyhyoso:-::/:---
`````````````````````````````   `````.-/+osssoosso+///+oo+////+:/+ooo/:/+//-o+:::ys+mNo/ooyddmhmmmmmNmho:////:-`.-/--:+ss++/:///yhsoooys/--.`..:-/++:
`````````````````````````..````````.-/oosyyyssss+ooo+ooo++/::/:.:+oys+://-:-ydhsmh-.hms+yshdmmmNNNNNNmdo/:::///:.`-/:oyyo:+yyy++oy+/++/-.-.--.-.:-++y
``````````````....-....`...` ```..--:/osyhhhyyys+yyo+oss++++os/.-/osyo//.-+-.:--.`.odhddhhhdmNNNNNNNNNNh+////+://::/+yyyy+/sys//oo/`.--:--..:..-++yyh
`````````   ````````````    ``.---::/+oshhhddyysssssssyssohmms-.`.++yoo:-://::...:ohysyNmdhmNMMMNNNNNNNms+////++o+/..//ooosyss//-..-..--/:`.-:.-:+hdh
`````````````...``````````.--:-.--:/+oyyyhddhyyyssyyyyshddNm+.````.:+oo/ooooo+/+osyhyhhNNddNMMMMNNNNNNNNhoo+///osoo/.-:--:+ss+oo-.:-:-../.`.-::-.-ymh
   ````````.--.--..````.-:+o/::--://osyhhmmdyyyyyhddhddmNNh:```````./o+soosoo+++oshdmmNNNNNNMMNNNNNNNNNNh++so++oyyys+::::-.o/:+://.---::+:-/+-::++dho
           ``````      .oyso/---:::+ssydmmddyyhhddmmNNNNmo.````````.-/odhhmmNNNNNNNNNNMNNNNNNNNNNNNNNNNNy/++osyyhdhhs..:/..+-`//.:+:-./+ssooo.+:/oyo/
              `  `  ``-oso+o:--://+++sydddmdhdmmNNNNNNmo-``````....``.+hmmNNNNNNMMMMMMMNNNNNNNNNmmNNNNNNs///ooshhdmhs+/+s/+oo::/s+/o//+++::so./:+::/:
````````````.````-.`:ossso++//:+ooo++shhddmdNNNNNNNdyo:......--...````.+ymNMMMNMMMMMMMMNNNNNNNNNmmNNNNNms//+ossyhmmmhs:-/+/+/+ssy+/+--osooss+`so://++
.......-.-.-/--.--+syyso++oo+++osooooyhdhhmNNNNNdso/::-.........`````.`.:odNMMMMMMMMMNNNNNNNNNmmmmNNNNNds++oyhdddmmmddy/+::/+os++ss/-:+/:shs/`:/.-+os
--`.-::::--/o:-../oooo+o++ss++/oysoosyhyymNNMMm+:--...................--:+sdNMMMMMMMNNNNNNNmmmmddmNMNNmyoo+oshdmdmmmmmmy+/+/os:+s++/:+/::/+/-`.--:/oh
/:-::--::..-::.-/oossoo+//++/++os+osyhhhmNNNmNmyh/.`````..--...-----.--:/oo/+yNNNNNNNNNNNmmmmdhhdmMMNNmhso++syhmdmmmdmNdhyooyyyooo/ooys+/-::-..+osshh
-...--::-:/:.-/+o++++o+oooo+sysoosyyhdmmmNmddmmmd/.`   ``.--------:--.-://:``:hmNNNNNmmmmmdddhhhdNMMNmhsoo+++oyhddmmmdNmdyo+:-/-//oo+/:-..-...`-/ooso
....--..-:+::+++o+oooo+ooossyNmdyhddddmmNNmhhdmNo:-`    ``.---------..-://-``-:sdmmmmmddddhdhhdmNMMNNd+++oo++ossyhhddhmNds:-.:/:::---:::://-..-------
.-.......---/+++ooosooosossymNNmmmmmmmddhhysoosy/::-`````````.---.-....-:/-``.--/ohdddhhhhhhddmNMMMMNy+//oo+++syyysyhdhmdy:--//:++/++ss/o+/-:-//+++os
.::.--..-.-//++ssssyyhddddhmNNNNmddddddhyso+/oshhyyso::-:-````....-....--/-``...--:/oyyyyhhdmNNMMMMMNyo/:osss+/shysssyyymh+-:++++:/ooosooo::+:syyshmh
:+/---.``-/++oyhddmmddhdmdmmNNNmmmmmmdhysssssyhdddhdhhooso/:-.``````.``..-.````......-/oyhmmNMMMMMMMMmso++/++/+yyyhsosyhydh+///--/ssyyhhy+hds:+ssmdyy
:-:.-..`./++syyhhhhhdhhmmmNmNNmmNmmmhyysyhhyyhhdddhhhdhhyhhyso/-.```````...````.....--:ohmNMMMMMMMMMMNhso+++/:/syyhhysoyyhdhs/:+/+o+oyyh+sho/-:-ydoys
:-..-.-:oyyyyyhhdhhddhdmmmmdNmmNmmdhyddhddyhhhdddhyyhdhdhhdhddhyo+:..``..-......--:/oshmNMMMMMMMMMMMMMmhs++osoooyshhhyoossyy+.++oo+/+o+y:oyoo+y/h:hhy
:..++-:sdddhyhyhhdmdyhddmmddmdmmdddddddhddhhhdddmhhhhdhdhdddmmmdddyo:-:/sys:.-:oyhdmmNNMMMMMMMMMMMMMMMmdhyyhhsyyyyyhhhs++oyhho+-:..-/+/+:os/:shho:hdd
.`.---shddddhyyyhddsyyddhmhhddmmddmdmmddddhhdmmmdhdhdmmdhhhhdmmddmds++oso+-.:+ydNNMMMMMMNNNNMMMMMMMMhmNNmddddsssssssyyso++yhdy/.-:+ohso--//-:shysysoo
.```.:ohhhddhhsyyhsosydyshyhhddhddmmNmmmdddmNNmmmNNNmmddhyyhdmmmmNmds/:::-..../yNNMMMNNNNmmNNMMMMMMN:oNNmdhhmh++oyhysoooo++oyhs/-/ssyo/:-:...:-.::.-o
`````./+shhdyysshysysyyossssyhhhhdmNNmmmddNNMMNMNMMNmddhhyhhdmmmNNNmdo/::-...-:ohmNNNNmmmmmNNMMMMMMh`:mdhhmmhysshhdddyosysoossyyo//+ysso:/:-..----:sN
.`````-/shhyhysyysyyyyssysso/+so++yhhdhdmNMMMMMMMMNNmddhhdddNNNNNMMNmhoo/---::/oyyhdmmmdddmNNMMMMMN:`-hoyNdosyssymNNmhooyhhyssyddhoos+msoydshysd:-oo/
...```.-ohyhhyyyyyyyyysss+:``.```.:/:--/osyhdmmNMMNmmmdhhmmNNMNNNNNMNmhds::/++oossyhddddhdmNMMMMMNs..-o+hNddhhysshdmmdssodddhhhdmmdhy+ysshhhdddNyyhys
-.....`./hddyyyyyhysyy+/.` ```````.`  ```.....::+dNNmmmmmNNNNNNmmmNmNNddh+---:///oso+///+shNMMMMm/--://odNNdmhyyhhdhyhyosNmyhddmmddddhyooosddddmhddhs
.-......-shhyhshdhyhy/.`   ```````    ``````````-:oNNmNNNNMMNmddmNNNMMmmmds+:::/++/////++sdNMMNh:`.:.--odNNNmmddddhs/+oohNmysyhhysyyhhhhhs+/yhsyssys/
`````.``./ossydmmddd:`     `...`    ```````.-````.:mMdhmNMNNNmdmmdmmNMNmmmmho::/+++o+++osymMMmo```....`/yNMNMNdhyyhyo+/oydmyoossyhdhdmmmmmy+//osyssy:
.`...````.-+osmdNmd/`       ```  ```````.`.....``.+dMNoydmNNmyyhdysdmNNNmmmmho+/oosyssyhddmMh/.``...```:omMMMdyhhyyyhy+oyydmddyshhhhhmddddmho/ydd+ss:
.``..``````.:oyyy+/.`           ````````...-`````-smMMy++sdmyooshhohNhmNNNNNmsssssydyyhdmNNy-...........:NNMNmmNNmdddmsssyhmmmdyhsshhhddhhhhsosdmho/o
.`....`..`.`..--...`          `.`....```..-`````./dNmos--:+ys++smdoommMNNNNNNhyssyymdshdNNy-.---.-.....-+NmmMMMNmmmmmmdsssyyhhyhyyysyydddhhysosys:.-y
..........-.....-.````````````.....`.``.````````:hNMNo+hdhdms++yNysdNMMNNNNNmdhyyyhdmohmNh:-.-:-....-:+//yymMNNNNmNNmddsyyhhhhhyssosshhhyyyysso-`-.::
--....-`...--...--````...--`.....``.``````..````:dNMMMMMNNMMMNNNNNNMMMMMMNmNmdddhmhddyhNN:.-/:/::::-::----ommmmNmdddhhyhdddmmNmdhso+syyyysssyy+--...+
:-.-:-...--....---``...---..--..```````....`````:hNMMMMMMMMMMMMMMMMMMMMMNmmmNhNmmddmdmNN+..-::+s+oo::-://-//syshdhhddhhdmmmmdNNmmdhyo+ooosyyhyo/-..`.
.....-.-:-:---.--.``...-.....-.``    ``...`````.:smMMMMMMMMMMMMMMMMMMMMNNhddmhmdddNNNMN+``..-..:/::-::+/:-..:+-yhdddmhmddddmmmNNNNNmhhssyyhdmmhs--.`/
.----..-:-:.-..:-.`...---.....`    ```......```.-/hNMMMMMmmMMMMMMMMMMMMNNhdddddmNmNMMNo-.``-:.............``-.-y+dydddNmmmmmmNNNNMMMMNNmmdmmmmmho/:./
--:.-...-/-.....-```....-.`..`````````..-...`...-/hmMMMMMmoydmmmNNNNNMNMmmmmdmmNNMMMN+`.-:-.---+/:/-...`````.`--:yssydmmmNNmNNNNNNNNNmmNNmdddhhhs+-``
........-:-:..--.````..-```.--.`.......--..`..--:/hhMMMMNNs//:+ooohmNMNNdNmdmNNNMMMNo``-://s:+/++o+-::..``..`..-.-:+sdddmmdmNMNNNmmmmNNNNNmddhhhyo:``
.....--.-:---:-.-````..````.--.....-.....`..---//oymMMMMNNs/+:oo+:+yhmNNNNmNNNNMMMmy::.---/o/yh+-oo+/:+/.`:`-.-:-``/syhdmmdmNNMNMNmmmmmmmmmmmdddy+-``
.-------.--..::::````..```.-.......-.......:--:/o+hNMMMMMNy/o/oo+//odymdNmmmNNNNNmhyo+/-```  .-:.hdmmdy+-/+.:..-:..-:/oydmNNNNNNNNmdmdddmmmdmmdddyo:.
/:::-:-...:-..:+:...`..``..-....-----...---:::o+ssdNMMMMMMh/+::///+ydsyo+o+o++///::-:-..```     `smmmmo+++:.:-:-:/+-./oydmNNNNMMNNNddddddddmmmmmmdh/`
////+:--..-..-:-::...-.``..--.-..----...-::::/osydmNNMMMNNNds++++/://-..--.--------:--..```       -+sy:/.:-.---.../-:/+oydmNNNMNNMNNdhyhhysyyhdmmds-:
-.:---..-..``-..........`..-.-...-::-..--:-:/oshdmNMNMMMNNds-.--.``.--..---:-:---------.```       `.:/:-........-.-..---+hmNNNNNNNNNmhysossyhdmmmdhs+
-..-:/...:..--......`......-:-.-.-:--.--/-::osydmNMMNNMMNmho-.-````..-..:::---:-:-::-..```        .+........`````````.:/ohmNNNNNNNNNmdosososyhdmNNmo-
.:/--``.:::+/:...-..`.-..-.::--:-::-:-:::://syymNMMMMMMMNNmy/------.-:/::::.----:--.-..````        -::/:+/:+/--.:-`.:::oyhdmmmmNNNmmmmysyyyyhddmNNNd+
-:o/::-:/o::..-:..--..:---::-:-:::::--:::+++yhmhdmNMMMMMNmho:-.----:::::-://::-....-:...` ``     ```::++sooyhyysoossos:+ydddmmmNNNmNNNmmddyhhhddmmmNm
::/s+:y+-/+:-..```..`.///::/-://+/:://+ssssyyo:.`.oNNNNNNmhs/:-::::::://:-::-:::::-::.`..``````.`:-.-s:o-osyhyshhhyyshy-ssydmdmNNNsmNNssmdhdysmNNMMms
:-o///+:--:--.-:/:--.`:+++/+///++/oosyhdhdys-..-`odmmdmNmhdds+/+///:/:/::--::-::::::-..```...-:+:///.yd+:+shs/yhoyyysoss:osyosdmmNdhNmo-:+///`-shmmss
://.....-...------:-../ss+/+++sysshhhdmNNNmddmds yds:-/hmdydhsoo+///:::::::-://:::--`.-.`..:::++syys+s-::y+y::/:`-:::::-`.-/``.o/-:```:oo//++:::::/::
:......`..`...::.--:.--+o+syysshyhyy++shhmmNNNNh yms` `+hdhohy+s++o/////////:///:--..-.....+y//ohh:+-`-:/++:```..``..````-+//+::...``:/+-.-:s+o/+/:--
....--.......--::/-:::+y+:.--/sydy++oososyddhdmd.`/yo:``.--:::oo+.--/++oo/++/+oo+:/++o++o/-sso/::/-://::...`.`..`.`..-:``:/..::-.```..:+-`.-/--.--..`
--...-.......---+:..``.:--.`.``:ossshhssyyyyhhhdy .hNo``-y-+o/+:o+o/-:-::::-/++y/-/-.::::::/:-.-.-:--/////-/::+o:+yo//-.:.```..`````.::++-.``/++/-.-:
.-:--++/-..`./:-.....`-.--:-:-.-+oyddyso+osyssosy.``-+.`--.s:-yyo-.-`--:..:////..:../:/.:--:-.-:-//::/:--`.::..:-:-/oy/:.`.--..``..`.-.``.-.```.:o/--
::-:/:-..----.-..--...----.-..-./s+:--/+//++o/+oo.`-````:.``../s-.---oo/-/-//ss/`--:+://:-++::-o:o++.:..`.--/:-`./-:.:-..-:/-...-.-/sy/-++o.---...::o
:--.`.----.-----....:---....`.-.`.:-.`.` `-````..`.````-ss+:/-:-//:`--:--:--+ss-`-/+::/+//od//ss++oo/+.++o/:/-../...::::/-+:.:::...::./+/oy+-ooosso::













*/
