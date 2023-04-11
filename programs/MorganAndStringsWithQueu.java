package com.hackerrank.programs;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MorganAndStringsWithQueu {

	public static void main(String[] args) {
		String a="MZBMWEYYDIADTLCOUEGMDBYFWURP WBPUVHIFNUAPWYNDMHTQVKGKBHTYTS ZOTWFLEGS JZZSZFWTZFPNSCGUEMWRCZQXYCIVDQNKYPNXNNPMUDUHZNOAQUUDHAVRNCWFWUJPCMIGGJMCMKKBNJFEODXKGJGWXTRXINGIQQUHUWQHDSWXXRXUZZFHKPLWUNFAGPPCOILDAGKTGDARVEUSJUQFISTULGBGLWMFGZRNYXRYETWZHLNFEWCZMNOOZLQATUGMDJWGZCFABBKOXYJXKATJMPPRSWKDKOBDAGWDWXSUFEESRVNCBSZCEPIGPBZUZOOOTORZFSKCWBQORVWDRMKLFDCZATFARQDKELALXZXILLKFDVPFPXABQLNGDSCRENTZAMZTVVCVRTCMBQLIZIJDWTUYFRXOLSYSXLFEBPOLCMQSPPMRFKYUNYDTMWBEXSNGXHWVROANDFQJAMZKPTTSLILDLRKJOYRPXUGICEAHGIAKEVSJOADMKFNKSWRAWKJXWCMCCIABZBRSKZAZJQTLKIQYDPTPKCSDGCQJSHZNDPVANNRYWFRNRGHLJJQRXPXNLKCWDPDKSWVTXGANWWYOOSXTNEXEEZJXOUYFJHNWPQFXEXZXFOLPCFBLPNCETYHTRWXKBOSCCSKXBUVCROSAVNPXZOEOYYGHBBQKFLSUTPWMHQWKVIRMLFCPIDLQYIKZMNTTAIFCBOPNWEZESOMKXHAIAFMVKBJAISYRBTULTPNXBCJMORNQUMATSERHIEQGGRIVOUWFNBNGHDFALLCPRVNGIKCAMVPRZAEAPQMILWKBKGOGOCNIAAISORFQXZJZTVCGVZLCEDWNEZBWXMPOBMRVXASKWVVWQUUDRNWHMMZHEQXIWHFUXAVLWFTGYXXHPYGSPVWDNVMGNWNPKDRNZNZVRKMJJMWISYRDKODOAFWSJFUVMEEWPDWPIYMWBHOXEBJIBXPHIEFGTSAWCDIVTLTRSHJQNKKMDTJGSCNOZMOJNHIGIPPJEMZZZBCVOYPLXENFFMFDZDIOJUODGBULVIVHTBHAYEEEBIACTYAOVQBIVUDYDGXWSGMHLRACAAYIPSOJLEQHPYGSHCVXWWLNEBLFMNQGDDQPCJXZFTWRLGPTRKBKRLWGSNLCAUDZDUJBBQLFZIKGXOHVHTUVCJMMWVHKXCGYEKJKKLCJQONEPPYDPSPIWQBKPSUNEDQIXLSIFCOKFRCVRSZCVDYFWUHTZPTBBNXBHQJOMXRBHJQXVDASERFFCVKECQYLQPRAWYQUEVHVUZCVFMBEWPXICSKPMZSBSUSMADDQKWGFIRLZZBCZEGHMUHXNXEJRSPCVQEJWOWQSFHOVHCTWNHUUVEPRRIYFWSTSJDECYYFJBJSDLEGQLKLXIYRWVLPPOMDFDTVTKWOKIWWPEJXIBDKNPONPSXRYTOQGJRTJPATMDLHMQEGVJHVLEHSYKRLVVSSMAMBZUSXUSZYYBDRDVZDBEXSGLYOKVMYKIFWGFNCSACJLKATHFMNLCTSQEJFOXYVMTOTTLHRLYPBZISUCLLQGAAITMXPMFINSOWJAAWSNMLUIZVPJBEWQCIPCQWVSQFBEUTDCSDRVIOZOBDYTWSIMSEETQCKLNKXTAWOXIYSVZRAKQEISPNDDXTNFQALSWXSMKSFOOIWXYNAMDJXNSMKIEWKWDPZJPKIBCBBMZBIWPMJCZCEHTCZQJZLKGYVSZPUUVETDFLUUHXPEOPUXMDYLAYSTTENJMCEDCUMOEEICJTXKKVXCXJOWRCVLTTSQHWKBBMIGTQLOVJGVIYZGCQJVPVOTWUCSETIDICYHTCMAJPHXYYOOEOVUXVUPLOKLPBOVQDWDYPBXGAJUQWADGEEDJKGURHSXDVYLMYFJQLWZLDROUYLQOBSGEMWDOIBQVCYEDFVQOPFHKQMHUSXQACOOGJXCOXBFZLWCXFVQAAVFEGKCIRQQGDYHLJMAQZQIFUAOUBUKYPAVEBVDUJGSULAHKPRFPNZQAQGVFDXWTQFLCEILPMSZIZFWBONXPLCYQITTPKPBCFSESGFBIQNIPOLEFRELPHJTHQRZSPHBNUMGRIFMWIZTFUHQIBGAXDVYSYVGXLSPMINYKBYUMEPUBRXUOAVYOVDBIELZDOBGQCJZNJBEXALKGHYWIOXZBVXZFCSHCOZMEFWCRVYIBJDFQVQMHXDPCCJODLGVKPLRFDEDPZOPRFEECHWSZHVCDOOEJLCHCWCEKTFRDMOWHSUEAVBRAWMIHZSNFHRAFBQEAWDIXZNPPFWIEAIVTMPQZQTSVNVWJMGVHUESSSAXGMOYWDGVWIOUZUQDEBIJCQYCFTAFTUWTGXAVEMCIUQMXENPRPMYZREXSHNVTESSTWHYTMATXBUZXPSTPYGFXPHPFCKJDBFBXIMEESWYNDFHOMCNWJTFRUVZWBHLZBVEBYEUCEPGCDPMGHCIBFXGRVNACXWLOPXSVZCLWYMWDMOLJTAGUWUVHXIFDJQSHLQAUEGLQRBXUWPOZFVEGDPVNWMEDXBMXAGIMXMXGJLNNFKWBRQSHXFCANWPOFLQEJAFDKTNLPGVLEXCYGLRZBKHCMXVUOBYXCXZXQMLSWVLMBVCSDTEFCQTMLILWZTBSCFHJTCYTONMLIIVRKBBLVNMHIPRGERYRPJPJYKCHNEYFYMIEFYMAJRNWJSLYTBXMDUWTFZAFKXYFMCNLJSEBZLEYGEGUUJMKYYLFMMVVILJWGCYHRDLDKZFZGTVMOWLBEQTJSODVHBUUMEXPPCDXQHCEQLDFAVGQLVITUZZNGJEOTBKJZCRTGGLUIAMNCORBKIWDOZITQGQIPHVWUIJWHSMGOGXOMLUQURCWOGGHHJJCEKGGLLAMQGXHCFCMRAKGROJGXIZWXASCASINZXCDXEWCULOFITYLHXHZXMJDLISUPDYLSHAHCIPZOPTULLYISXSCZJQAWAGNNGCGGIWKHNARJISVCDPZGGTLLUDVCSJXEUBFGYJDIMTPFTGYTKFNTYLNFLBFUTSYOVXMLIGOAIQZLXWFRSLJUCDXSSAMGCIFDLJASHCJJWHLKQNIPXZJGLPTEDZXMTHVZGRUHHCKUFDECAKRRZOQFQCDUZHJSDASKQGLQLNNBKUUYTQTHFCJRAAWTBCCURPZPUMCSMQHEBHQRFIGAMBLZXYCVEVLUZCUQXVRJGEKYAOFVRVCOHLDAVKJIYKHCCMNJPDHKKIMPSMVCYQXLGWLBHLDKJLZWTHKFNIZEBVLGOZRNWWVXDCKGNCKQTKQIDHOOCIWRPKXESLDTGXTAURGLBGMPYQLPZBNSBZHANBIYPUZIQURWRBRBXMHBRDPDRERBOBAJULDLWRPKRTFBLSPNKXYITIOHLPGJLCKTLAQSALNOIPHBTUYRRGHSEZNKMZUKAIIHATZTTIYLACTADTNINWCSUFBYNJKXAAJNAGFEVSCFUHOAJUQMISGBBSXQBYLMRASZACPLIUGLQYUZBNIZXXJXNNTSCKJZJZJMMYFMVXJAOPVEFHWHBYOAPKQEDYDDTRPBLPORURSKNPBTAMZKKZRRDDCMRAYGLNJUIKQYNJAUCAQEKHCWXDQPDOHYCVAEXJYULGVWTOVQGSFIVKVUNQDEKHNGXJYYCSPVZULHKYWGQJGAQCLPSXNSERDNRJXROZMXTJTVOSSYQPVOTKHMBQAXIQXUXZLZTKSOHUJRTAIMPDESFQJBJIFGYBEBNUIICFJTEQFVSYRWWJZISSAIMGCUSLEIACQXJIPDTILJQRBLDLIRSIEWJPLNAIDVVIXJQTQJDOZLDBBEEMVMVEQLHJZTCOUOSTCGROMEKRINQBGVGLJHVEAONQKRTJJTLGBKRNYOIXIRSLFSZFQIVGKAFLGKCTVBVKSIPWOMQXLYQXHLBCEUHBJBFNHOFCGPGWDSEFFYCTHMLPCQEJGSKWJKBKBBMIFNURNWYHEVSOQZMTVZGFIQAJFRGYUZXNRTXECTCNLYOISBGLPDBJBSLXLPOYMRCXMDTQHCNLVTQDWFTUZGBDXSYSCWBRGUOSTBELNVTAQDMKMIHMOXQTQLXVLSSSISVQVVZOTOYQRYUYQWOKNNQCQGGYSRQPKRCCVYHXSJMHOQOYOCWCRIPLARJOYIQRMMPMUEQBSBLJDDWRUMAUCZFZIODPUDHEEXALBWPIYPMDJLMWTGDRZHPXNEOFHQZJDMURGVMRWDOTUWYKNLRBVUVTNHIOUVQITGYFGFIEONBAAPYHWPCRMEHXCPKIJZFIAYFVOXKPASYIWXMRAHUWLAOOVREJHPBIIQMDPTEFNNGFZTQHHIFMTHLXKQBHISDXBGOTYSPNVUSLDLFCNOGNDBCJXQDUSSOEGPWPRFUSSJQHKHBHPHTJKYWSEBAAVJAUPVDBXFITSYOJEVYCPXWYXFKZDESBNOACIXWTRHQHFIMUKKDINHWYXNJKMOPBHOPLFMPLQJYFIAZKXXDMZBNDUOAXJDAEVIBEQACBDXWRGSFVPLKHFPNLPFLZNDTLUWRIGJJTTHZHPOWRYLZZYVNATBAWWXBYDUUSBDHBGGAWQVLRBMPGKNZVLKEEAVEKLVQUTZZDRQONOWWVWJFXXLTXMXKKPZKYFZSVYVKVNYCVPNPQBRIBPEMMAYFPNIWAZHBJEZMENVESSYPPASIFGSSFWVEUXASVKMPXZVZOOPTVOZCYQPXANFTSVGLUXXMWTERTADXMAMTXRDQNPLOAGMMGETHVBNEXECQIDNZPSZHLHPSOEMJFRDPFAWNFHYQUWIWNUQZTLHKLUBMJMQIMOYUMBUPRIGZZXVKJJOXHYUSUKLAIYMPOPZYVEWMVQMSOISXZUHSQAZGGGNMRUXDKVGPUCMTZOSJLRPDWAEKOXTRAWMHIJIZUQRLNKIEYLAIIYMTDFTXJUUCJIPOZZHGBIZWMNCRCABVMQWAFVMUXYYBVCIURGYAPTMPVLCNYUHAYTABVKSPWISDSDSPXYSOPDEMQDGQAXUOOOMPKYSOKVZZHDPMVNURNAULFUTCUKWGTXNQXMUKBXNLIDVYSEWBWMSNSRFPXXFTMJUEDKSDMNBKLSRNJPWVPQWMXXTFFGTBDBJIFNRVWZTBDJRBAZXOTGFQVYQPGRDOJJGJVQIWLDVJINOEEBSCJCISYVUTVHVMIYCOYSZFEXXAFMKAXSXWKTFCFAILJABWUNYLERKSNHSAQNHOVLTHJVSUMBZQSJHRLLOVOYUBXMXBYUNVAADRVBEJOORBYHWUNRHNIXRHWODLXNGPQURFPIQDFTESWNRNYFNRLLTCTMJVSJXPFQSGPZEQQTREWWSCEICEANFVODTIOKDWTZOQOBOIIOXGOMODFASZWZGUZZYQITDDCINEMYPCBFELHMHYPBTBWMCHQHYGFTVAOFPXWMPMFBCFNCLQEXJGVZPQBXCQOSKJDXWHIMEUWXOPZAFASCSXAWAROBLPMAMKLRWLZNPLGSPUZVNUBPUDIBPTDSLAAGXAAACQRSFVHCLAEDSMLKJAQSOQGFPOVIGXFVHLTPWPTOJSARDOZOGRLTULBERIYWIREEBJDDKDHPYLEYPYLEVVGLKCKUBMYGXZQMEEYEHJEHKNBKPRSVDGJOIZZGJSZEBTAQQGZWYFGDCBKDGXZURJPOAHRHDPQEXZSRPGVDUTABOGKWKUEHFZWHVAMSNTZUVCRQZPLXHYKIAOAPJZKZNMLSNEZSSKDLOSIYFAWAZNBUWENOVCSFKFUHNTGLVESXSRRNZKBHZKHZMVKJEVSRBDICLCKMSGPGNGYCKZVGYSVWCGWAYJOKQACTFXTIVFBDWPRUFIVTGGZHBPVLXFKISDNEOGDSEENJLEWROBJHPPPJCZYXEAIQANAZTKSNPFWYHDJVIPGWZZNMNNXWRAIIEICSCDHRYZVRHTOPRRATXUFCITHOKIOGUDGGZPVJCTBAHNZDWTOKIATSRIQZWEDRRFZBRKGVYNBBFOMOIAWWMMJIQVHDLNSVWNWBKTEHYKEVHACVDFLMNKRLJMIJVFXDVDYDMVKJSBPMCGMNFTSEUMHBDIOHZCJVPAYXQWDPYCHQCTUDLKEDTBJDUQBZWXVOXJLAJSTAOQNRRRPXCNDMWHLWDYGNNORDXMUJNZLKEAMDXANOKVBVPLRWXZIJPJKULODEULUEPKSLYIUZYWPYYFOCICAZYEWQYULJLFMTHLIEOLXUYPKQPEMFJJPSWULKNGYTFFIXVOIYUUSYBDMYGPUGZHUERHLFELEMNNAVEFSUQIKNYEDQTXYEKPWPDPCUUIMOSYTASPBMINXPVBCBQOLOSVBRPPGPYVIXLSXHQDRPHMJPIHERRWHDWOSAPJFTERGJSZLZWCIHWCUEGFCPSAQJNNFFMVVEUPTMNEFBHOHJBCAOCDWJYAYLNVZECIUCLQUQEDNWKYFYMGRFMZXQPEJCIXXPPQGVUAWUTGRMEZJKTEOFJBNRVZZKVJTACFXJJOKISAVSGRSLRYXFQGRMDSQWPTAJBQZVETHULJBDATXGHFZQRW";
		String b="FGAKWMOAWL ZQJYPMHLLBBUUHBPRI QSNIBYWLGJLXOWYZAGRFNQAFVCQWKTKCJWE JEVZBNXHSFMWOJSHCDYPNVBUHHUZQMGOVMVGWIIZATOXGBLYUDIPAHFBKEWMUNEOQHJMBPDTWNZNBLWVTJRNIWLBYBLHPPNDSPOJROUFFAZPOXTQDFPJUHITVIJROHAVPQATOFXWMKSVJCVHDECXWWMOSQICZJPKFAFQLBOXOSNJGZGDRAEHZDLTTHEMEUSXHIIIMRDRUGABNXWSYGSKTKCSLHJEBFEXUCSYVLWRPTEBKJHEFSVFRMCQQDLANBETRGZWYLIZMRYSTVPGRKHLICFADCOGTNIGDRXASLQUOLBTOMEFRTOCGSYYXMMSOESSJMKVHSKPLOEETLFVCJLILCEMZWTVJILGDVBVAFAEQQOJYPXJDYXDZXBTKCCESYMPAXXHZCAQJDOIXJIIVINPIDPFJHVAVBWPCKQNCJWYGBBDWBQJVDEHKEVSNTANOWLERSAPPRUOKYWNEGNCMJVJXCSALRMIUSZJMKAPBWDVDNJXNXRNLMIRLMEHSAYUHJPAJKUXSYRIRKPMGZCYUPOIGWSDQSUXMAIXWSQGVLRJZFCQRPHSBGRSFNEAIJELHYRUMKQPKQKLSACNHPZNPXZSFGMCOUBKPCWZMKMAXJYPVSWRIGSVQGOGOQCIVAZSINDEHAOZDDWXTTFFSHOVPVPOLDLONLKEGGVXCYQKABPWNRZEJFDOPDHXKOQSPEVRRJEOCHBDFQBVCOYVFFVZAUUFRROHJTXNJZPMKDKJBFQFLIVIGIWZTGBYBUGIFDYHOJTJKOAQIEHKJMATGYHGKJUMWVALSQMCOIIJVWCHNENIKRLIZWKHKTDXTQVXIBCTBNBXFUDIVICNLJLNZPGHKVJCOSVFNRYIPIIYLOTXANMKCLJVYYCMRTSCNDZIVGHXAIGWXSKRKSQJOKVNCECTSFXPGYORKUFSAACIQGNCVXTGHWTPBNFSKRMPZCYMXUGWJDILCORKRZPUEWAHXYLCGNZKSUSRAUPTYMACGTSTKDXWYGKDRGGMQKOMLRWRROQFNZPVWOCUAGGXCVBFLAUQXQBWTFYHPEYFDPYDBFANCNKGTYOMYHDODVBIQNEQFWSVYFRPIJYGJDUHWAGGCWZIDPHKRWYJCQGZPSRLCJUYBMGAORPPYFFUNUONATQSEYSOUBMIAFJBZXUIWSZUOVQEWCOLEJFLIVCKBBWDJGMZVFKXZXFDCXBAYMMNTIELKJNZKODDCPFEPDQHGYRAWGYMAMLJWNBIEAWIUFAEPOCJMCSOYNMIUPLAEKAXEXIYJFHHGXEQPXSVIEVROOOPKWNVXQAZPXLDLYEQWDUIQURNWSMXXARZOAMPOQOXCMQGAMIHMSRJNRLNIJTNZXCDYCZMYFRUWSFKVXVLJUPORLHZEQQZRLYDQLXTGJMXDSTCRABJCOPYBQYBAALILYZHYSADROQIJFHYVGZUFDLRZGECMEQTGKFGIFPYIEHMCGRPOPMOZMAECXFPKWZEUALGFDMDEXMKSIPYMEGERUXGTGANELJAMWVTXFQFCEHNCNHXAYVDRKWPPXISCAYKVMKYJKJJGZIDBATJUJGDCSOQNLXGXXDEYEWHVTNCVPUSJINBRRJCWFXCAFBXPYTBEYPCOSWMPDCBDCMJSFZYOOHDZYUDJOUKIOWFCMHPLICCYHIIGRNJMXYAFNXNFZVNBNSXBKAMPSWFMOOFLQWWDNSAJUZISGRZOZDGNHHUAIBGYCTPYQHCXCHHYGIHQAERMSPSGOMQKYLTMRFGQBDHILOYXFITYHEWGMVCAKCXUNUXOGDVURUMQOGWLJLFHYSYJVVEFPKBYIBZEQFJHZYMHDKDZUEQDHNYVQTUNONRXJNFBRUKWLFITFMOVPQNROHZNPYFCOZUGJYBLUVNIQUKMSWCWSRIWFQNHOTBAYAEQVYPHRKWUTQICJOWQMQNEITNCVUAZZNJOJVLTIJKFXGMUUXQAYPFTSRHSIFDBPPEVHQEDZPWOMZRSDEJWFSUUXEWAUMEYNNLQRKNKOTNCFKNVZSGBKEECUVNQPEFKGBIDLRSKWXIOCWGRAIDGDLEDUTXCLALKBNJNWMGSBOTNPGRVZQRGJKWPKADHCSCCXYCUKRESWGWZYJORWCBOKBMKPFTUCREJBRLPNQHMCCQJNYVEGKVPEATDZWCWABGKZEKKDYFGUBJDFDJNILUMMWXGVHHCFGRZINRODTIDTVLUOBAWQMXEAMUMKSCVLHMIVFUBJCMBLWKOXSKIRGQGNILLTZTIEAIPFRRSHTQLHXXIBAQMQHMBKAIMRKZVGEWNJPEVFQGYWZPPBIEIGZKKMPPLSYWCOFXBLCYJVESUHOVQVUYGOLNPQFPYRWYIUBIWQJDJHVJNTTZFNJIMRYVPYHOFLQTFRRTLDUJWPINXMJMCMWZMDLUUBVWSPACMHCWANDVPQYIQTOZIPDDJLATRPRDNYGMBAYNLFZMBMTRYTSQSXSUEJLGOOQEYUCQVJFSMHXMHXBCBDQSKZNXNNPHSOQJFMAQKLCMCKFGIESZPIRGOTZGVLHINLOGMTFNRQNXOBYLZDDFYFPYTCDEZITDUQHOZQXQXXTXGPZKKBXMKUHDOMJNRFTOJTRFYUPNVUOJDBUYCZOAHWVUUVVZAPUNXUYPBQQXRYAHDFHFRJSXYUKJFMRUWPJAJJCVJBKXPTGQCYXDCVAAJMDHKBAAXQVZIGYBWNIUFUCUCBZTNISVHQSZVKTILNAGLUPTRWDGTCDZJJXCNWESQXFFBXYUQMQVYDZSRUHXEVQYMJURMJNILNRKEEPDSYYSVBAEKSOZXFNZXEWJRVCBOXLJNXJDXGFHTGRDXOHNJTIYNSPKWGTNXSXJRIJYTXLCASQPDLJZLNXVPSBJQEKRUNUEHMHNGYUMGJHBOEOBQNLIFESKIVABBAEPUTXUURWPOWHFUSACEJXOMOSQBOMLEUGDHZLVTZVJKZPFZYCZIVPIOARKAXAWRPXYZOSGLXXLPWNWNLZFJDLDRFFUDMYWWPJTLKXMOIRWVOLEKXPMYHDYJAEQWKNFPAPUEGIRCDOWKUSEYBNBRCWSCMLUGZFKOVXYSYPZEKEEDCEMNKIHRYLIZMAKZWCDHQDXFKRVSQFHCLIUBNUWCJKDGPOYNPPAGPZHMMOVFURADZEMPDWJFVVTGMSALSWWBVJAHWERCTOEZQYYZOSXHIJGKZKSPPPVVLJVEDHURQYXRLHTEZGPHNBPUHGKMRCLIVKHNZTOXSEJNOEPWPAJUQRWZXNOWQXQPJBXZSYBTYAFRQTLECKZUXDLWOUWIJCGHHGNSOWIJQPHEMOJMZAIEORVNBNSWIUUYYTMUTIVRDUPCGUVSGNGMQWWSKXGLDLVDRMMAQHCZCTLDSRYAYGNNDFGJGNUALNZRULIRVGRHHPSOZMSTVDJCSMAACHWIGJSCNAPSUMXPZLLLVJJFOAMEMXUUTILACVKECCFEZYWBFTNBWYJTYBGRJTQCKYTLHDZZUWQKCGESMFUCYQPJLQXSJRJSNFUWBDCDQSAJDIMLRCVTJCXOETTGXXJJBCNWUNUUYERUOTKWXKXCTOVEUNECFRCWVYTIYTUIWSVWQWPIJISKVOQGYEYORJHDSKBCATYUPYQPBXPVTLTUDZMIVFLMFCERJOPFQFWTJCYAZCGRMFDLVLBAXDNNBXTAOSQRGJERNPPFRMAXZJQCPQMQHMSIRUQEUXXVEVDTKBGHFVPNIPVGLDDRRZQWOHCPYAKJCXKBOPXMXJKIAWLYIBCDHBXEUNRSVHWSVEYYWAWNFPJKPBCPSSADRKYQVSJRQBYEBEBCBAAEJCJNOYVYRCJUNQYAGAZPGLNZYRZWMOUNBIIVRLFALQDKMIVHIXJQODZCMCGUQQYXTNOUARYQCMAEIDIQVRDUELOHDQBAGTNMIWEUGTLGUGDBGXRIKEWSVURSYBMOTAOOCREFBNBLEVNTPELPJKUOYHWQJJRIVBQWZVUZWOUBMQBOMBBGQBFXHWHIYBFKVURXXGKONDDFORJOJTUTTNSDRLICJRQSSAAPOWJZUIFXQMSVXQJNNOXIJPWCMHGCBIGWDADEARLEAYZOCHOCEGGMOPMXQSZWGEVPGJISNXEPRDYQQDFFIOAGLKBVXVMQOBEAXNFVERARXQLPTSVRNETGHETGLSKMDXUVOOCGPXLDYKTWUJXBBUVLNFBDCFCXDVGXVBVLXCQKCODATAEUHVSKLCGCWHSJWWGAZCZVZNYZRVHXETFZZAWPKYIGZATNXIAVEVWFJUONOQDSKGSNDFXRPDSNGZOFADTEIZSBIBRRVUBFANKRBKPXNJXQPIJMKSNJRTYFLTREYENPGSAITRJDLEYPOTIMVWOXNVOJZXBBNTNUMOMGZLIJHAFVZRODTNWETXETDNXQQRNNNGQITRTFQTUVMHUDFEUQPWCTKVQAUTEAZSJUCFGPLKPGEZVDHWVUZKBHBIDBTNSHGWPFSLNWJGPBPTAQYLIBHZFYWZUSZPACXUKBZWOPDRKTPYWOIRJWFEKXONWBYKSTQUKZAJLUJJULEQORUFTAFGNKISKXKTSASSJRRWPOCEGOWQKSBSZLSVSYGALCPESNTLDJGRAKLQZNGIQYNIFOWBGCTQVAZPKUULWUZYIMDLSGKONXBYYTNTZKXFTIJJRWCRSEKWATROTURZPNOSLDLWPBOGGNJCWTFOPDHQGLLWXRYDXERNSFECYJIXGWVETICATGAIJQIZLKGVHLHWSGLHEGZIYUOEQDOKCGBQFVBRNHHSBEPDYKKYYGEUTUIFLJAZBCNXISFCODIQOJDENGXJQFLODZVNEENRGLAVZYNYHSXRGDIQPNUSNCPYDZJQKTYELPGMSBKLVMNLPGXCIENKRBJUWCMLLBKPRLUFJLJOKYNPPXBKYISXMMANLXUYEIDFZVEFWWCDKRPIIUTRWMINFZXGETXTTSIGFKGOFEKPIUWYZFLPKLBIMTOFJPXQKDQYAOIWLWMJAKZVHICDMYHCXGERYPPFGVHEPIMGRQOLQYIBJPHSJKMDKAQBKYWTBQEHRMYBEVNQUTDLYQPOGEMUUDZXBHJLBGVDNZUNUBUEPBCSJBPCYDEHBRGJPPIQEBGXHDTQXWIZICHYTSCEWAOUDJZEVUODGDGQFDZVRBOXOPVFDBOYSKOLRVDFOIRKQPIWOWGYPYBCHBMWTBEAOLSRXQCOXWNTBYIMAJFPAUYMWJWIBOTKZIUTTJQCNHUDHYLQBXRBXKVMUDTHUTQQENFNCSHTAQSWMQUCJVUZCETVNQQJSSEBSLRICSVMWQAKEZGIRYRHLXPEUGVSBIPCSMYMHULYKRIYHDMASFCJUIGRWJCHMJSLMPYNEWNZPPHMUDZCBXZDEXJUHKTDTCOIBZVEVSMWAXAKRTDFOIVKVOOOYPYEMIIDADQUQEPXWQKESDNAKXKBZRCJKGVWWXTQXVFPXCWITLJYEHLDGSJYTMEKIMKKNDJVNZQTJYKIYMKMDZPWAKXDTKZCQCATLEVPPGFHYYKGMIPUODJRNFJZHCMJDBZVHYWPRBWDCFXIFFPZBJBMBYIJKQNOSSLQBFVVICXVOEUZRURAETGLTHGOURZHFPNUBZVBLFZMMBGEPJJYSHCHTHULXARZHIZEIOEPWBIZHZKBDLUYTBVWVQIPIZQCWCAJKUFNQHMCRMMXZBLJPLVPXJGEXDFZLLNNBUGBMCTHSPXENWOVYWDFCHIDWCSTLBOCFZZYOCNMGAAUJTRLQSNIFLVEHWYIPPBXHVUIFUJIFKWLTVJBKGQPOOPTXEMXKRXOIHBOKYPCIZINRXTBRAXNMHKCSSHGUUATPPFHDHNWPZUKJYBKKVRMMPUEEHKJYRCRKPKHTBFQPYVRCFQALHOIKWFSQFSTYFPRAAHXHJXVSSCNGGGKGNHWHEPGUYAVZCFDKQBCMGROIDXRZYYNHWCDIUSRIQSAOWCZWUUYELCXEPXLWDCKNMDXAUTBDNRAHITQISZNXNISYOORKEPOPRZKLKGKHESPPLQSSAIMTLLTGAFHVLCCIZTDIDXPWHDGHOSCIGPPTAURARUEIHXOOOTZELVQBHVOQIOZHSTFXPWBFMGLKICKRGWOLHOAKATSSJLITQZJFHDFZLMDADKYPRFJSITGVQAIOFZWNKPRYCKXSJOZUINKHUFNWHJCYANIRDGWLFWUJGZCFGRLNKVYFOPQZTSUQSHDTKDGBRRKXWQPGLIPCAASJHKLYPYUURVGZBFAGBNQJWKSDMGDPFKDGQYGSEMVFITDEILCYDJNHUPZVEASVKJXGAMXNTQFZNQKMSOAREINWJEIKYORROZGFZHOYHMKUPVGURWSLCQSZRMOAORLUILDOYUBSXOYQZHCBRGIFOQRGXBYCQOOQDZMLTUWIQGFULDUPXAVNNJTRELAQIKMVGRPYSHCSTAHTZDBRVCHPTOADVZUAIKCSZEGAROQJNJHMJCUMBXGSZKTQFRUOSTVEVHHHECIOMZZKFFNHMLKYETBKVNVDOIMAKKOLLYUNRCNQUDGAZMEJGOAHKJAFILHXVQYSSVATIGCJZXIBTIRITDILDTFGGBYZOBBMXTWDAJAWQDYWNPPFLKKMTXZJVXOPQVLIWDWHZEPCUIWELHBUOTLKVESEXNWKYTONFRPQCXZZQZDVSMBSJCXXEUGAVEKOZFJLOLRTQGWZQXSFGRNVRGFRQPIXHSSKBPZGHNDESVWPTPVVKASFALZSETOPERVPWZMKGPCEXQNVTNOULPRWNOWMSORSCECVVVRJFWUMCJQYROUNQSGDRUXTTVTMRKIVTXAUHOSOKDIAHSYRFTZSGVGYVEQWKZHQSTBGYWRVMSGFCFYUXPPHVMYYDZPOHGDICOXBTJNSBYHOIDNKRIALOWVLVMJPXCFEYGQZPHMBCJKUPOJSMMUQLYDIXBALUWEZVNFASJFXILBYLLWYIPSMOVDZOSUWOTCXERZCFUVXPRTZISESHJFCOSALYQGLPOTXVXAANPOCYPSIYAZSEJJOXIMNBVQUCFTUVDKSAXUTVJEUNODBIPSUMLAYMJNZLJUREFJGUTAQNROMYMIKEFRFROXCSXRKXPICTXGVLERNYTEFLNCIJHMLISLUNMAOSOMKSNMTTOFLZQLXDDZBFFTUMVXLTYDLONVAOCDEZWTPJOZMOWKQWCVFTEJHXUTNHJRGWSNBYTSGTIGOMKNGTMNAYTTZNCQDEWYZXWSOIESHPDAWCRZHBLLHLXLIXGIHZTEYFAXZICQWHABLKKHCLXHFOQBPCXWXPBVPAWLNFNATOFEKRBXSFGEJTCDQKZEUJUNFCUWEVYAJBJARUPRXSYKONESFURJQFGBXHTYMDQQICWECDLCSREWZIYNZUWNDNATNSWIGTQWMPLHTCQLCXSUNZWYACZGWVUEMAZDGDRCFPXNLVDZVAUUZVTXAHLRXDBZZGORUGJVMXEUGMYCUBKTUMWGRRWQILYUBVJIBGHOGAZNUBGQSEYSWUNVEWTCRHNIKGEGLIYJICZSEKYMTQZTHXQCEHSEZBHKUFQGMGROGEWPMRXLQWNINOGKYZXNIRLEGLHRKAFLJAKMKUYDGLAMGUXUCRWSYCUUOIVHYWYICDQUZGHGCYSDXMFADGFYWRJJSQMYCSDXPRNURIZKJVVRHPMCMODFSEJOEETZKKJFTDDMYSVXJXCTTLZSRQKRCUHLIUMYXZXMPKVFHTGTUIRIPAQWZKCEBKTAEUIJBTANRFTVKPNRNXCMFUMOTRNENQIWSVGJOBTBKHKATMITBNXTNSKLVILZIXLGMUFFLRQGFTANEXECPTWYGAHZICXTTRJWIYKLIRGHYQMLWYJDAVEXJHVZHRLPKWFHSQZPRGIRCVVSHSDMQYCWHJZANIHPDSVMWVJQTSLQELNWXTOQFVIVIRNIAKTVZBMVEWGHUACGVBGSHVKWGVRKEDNGMADOCZXKUPWSSPBCHWLGFMUEYTURFHBHZDUAYMBAWLRFJDFHMMOCROUSWMPYXFPXWWYXYKJUVOCTGKZZIIUNYTVXHKJRFDSQNTSJUDLMXJLKWIAQEOJUEFCCNPJYIXMZSMHQQJOTEODIATBBSRVBBVLTH";
		
		String out = "";
		Queue<String> queue = new LinkedList<String>();
		Queue<String> b1 = new LinkedList<String>();
		for (String string :  a.split("")) {
			queue.add(string);
		}
		for (String string :  b.split("")) {
			b1.add(string);
		}
		
		

		while (!queue.isEmpty() && !b1.isEmpty()) {
			
			if (queue.peek().charAt(0) < b1.peek().charAt(0)) {

			}
			if (queue.peek().charAt(0) < b1.peek().charAt(0)) {
				out = out + queue.poll();
				// a1.remove(0);
			} else if (queue.peek().charAt(0) > b1.peek().charAt(0)) {
				out = out + b1.poll();
				// b1.remove(0);
			} else if (queue.peek().charAt(0) == b1.peek().charAt(0)) {
				out = out + queue.poll();

			}
		}
		if (queue.isEmpty() && b1.isEmpty()) {
			System.out.println(out);
		} else if (queue.isEmpty()) {
			for (String string : b1) {
				out = out + string;
			}
			System.out.println(out);
		} else if (b.isEmpty()) {
			for (String string : queue) {
				out = out + string;
			}
			System.out.println(out);
		}
 //  System.err.println(out.length());
   System.out.println("FGAKMWMOAWLZBMWEYYDIADTLCOUEGMDBYFWURPWBPUVHIFNUAPWYNDMHTQVKGKBHTYTSZOTWFLEGSJZQJYPMHLLBBUUHBPRIQSNIBYWLGJLXOWYZAGRFNQAFVCQWKTKCJWEJEVZBNXHSFMWOJSHCDYPNVBUHHUZQMGOVMVGWIIZATOXGBLYUDIPAHFBKEWMUNEOQHJMBPDTWNZNBLWVTJRNIWLBYBLHPPNDSPOJROUFFAZPOXTQDFPJUHITVIJROHAVPQATOFXWMKSVJCVHDECXWWMOSQICZJPKFAFQLBOXOSNJGZGDRAEHZDLTTHEMEUSXHIIIMRDRUGABNXWSYGSKTKCSLHJEBFEXUCSYVLWRPTEBKJHEFSVFRMCQQDLANBETRGZWYLIZMRYSTVPGRKHLICFADCOGTNIGDRXASLQUOLBTOMEFRTOCGSYYXMMSOESSJMKVHSKPLOEETLFVCJLILCEMZWTVJILGDVBVAFAEQQOJYPXJDYXDZXBTKCCESYMPAXXHZCAQJDOIXJIIVINPIDPFJHVAVBWPCKQNCJWYGBBDWBQJVDEHKEVSNTANOWLERSAPPRUOKYWNEGNCMJVJXCSALRMIUSZJMKAPBWDVDNJXNXRNLMIRLMEHSAYUHJPAJKUXSYRIRKPMGZCYUPOIGWSDQSUXMAIXWSQGVLRJZFCQRPHSBGRSFNEAIJELHYRUMKQPKQKLSACNHPZNPXZSFGMCOUBKPCWZMKMAXJYPVSWRIGSVQGOGOQCIVAZSINDEHAOZDDWXTTFFSHOVPVPOLDLONLKEGGVXCYQKABPWNRZEJFDOPDHXKOQSPEVRRJEOCHBDFQBVCOYVFFVZAUUFRROHJTXNJZPMKDKJBFQFLIVIGIWZTGBYBUGIFDYHOJTJKOAQIEHKJMATGYHGKJUMWVALSQMCOIIJVWCHNENIKRLIZWKHKTDXTQVXIBCTBNBXFUDIVICNLJLNZPGHKVJCOSVFNRYIPIIYLOTXANMKCLJVYYCMRTSCNDZIVGHXAIGWXSKRKSQJOKVNCECTSFXPGYORKUFSAACIQGNCVXTGHWTPBNFSKRMPZCYMXUGWJDILCORKRZPUEWAHXYLCGNZKSUSRAUPTYMACGTSTKDXWYGKDRGGMQKOMLRWRROQFNZPVWOCUAGGXCVBFLAUQXQBWTFYHPEYFDPYDBFANCNKGTYOMYHDODVBIQNEQFWSVYFRPIJYGJDUHWAGGCWZIDPHKRWYJCQGZPSRLCJUYBMGAORPPYFFUNUONATQSEYSOUBMIAFJBZXUIWSZUOVQEWCOLEJFLIVCKBBWDJGMZVFKXZXFDCXBAYMMNTIELKJNZKODDCPFEPDQHGYRAWGYMAMLJWNBIEAWIUFAEPOCJMCSOYNMIUPLAEKAXEXIYJFHHGXEQPXSVIEVROOOPKWNVXQAZPXLDLYEQWDUIQURNWSMXXARZOAMPOQOXCMQGAMIHMSRJNRLNIJTNZXCDYCZMYFRUWSFKVXVLJUPORLHZEQQZRLYDQLXTGJMXDSTCRABJCOPYBQYBAALILYZHYSADROQIJFHYVGZUFDLRZGECMEQTGKFGIFPYIEHMCGRPOPMOZMAECXFPKWZEUALGFDMDEXMKSIPYMEGERUXGTGANELJAMWVTXFQFCEHNCNHXAYVDRKWPPXISCAYKVMKYJKJJGZIDBATJUJGDCSOQNLXGXXDEYEWHVTNCVPUSJINBRRJCWFXCAFBXPYTBEYPCOSWMPDCBDCMJSFZYOOHDZYUDJOUKIOWFCMHPLICCYHIIGRNJMXYAFNXNFZVNBNSXBKAMPSWFMOOFLQWWDNSAJUZISGRZOZDGNHHUAIBGYCTPYQHCXCHHYGIHQAERMSPSGOMQKYLTMRFGQBDHILOYXFITYHEWGMVCAKCXUNUXOGDVURUMQOGWLJLFHYSYJVVEFPKBYIBZEQFJHZYMHDKDZUEQDHNYVQTUNONRXJNFBRUKWLFITFMOVPQNROHZNPYFCOZUGJYBLUVNIQUKMSWCWSRIWFQNHOTBAYAEQVYPHRKWUTQICJOWQMQNEITNCVUAZZNJOJVLTIJKFXGMUUXQAYPFTSRHSIFDBPPEVHQEDZPWOMZRSDEJWFSUUXEWAUMEYNNLQRKNKOTNCFKNVZSGBKEECUVNQPEFKGBIDLRSKWXIOCWGRAIDGDLEDUTXCLALKBNJNWMGSBOTNPGRVZQRGJKWPKADHCSCCXYCUKRESWGWZYJORWCBOKBMKPFTUCREJBRLPNQHMCCQJNYVEGKVPEATDZWCWABGKZEKKDYFGUBJDFDJNILUMMWXGVHHCFGRZINRODTIDTVLUOBAWQMXEAMUMKSCVLHMIVFUBJCMBLWKOXSKIRGQGNILLTZTIEAIPFRRSHTQLHXXIBAQMQHMBKAIMRKZVGEWNJPEVFQGYWZPPBIEIGZKKMPPLSYWCOFXBLCYJVESUHOVQVUYGOLNPQFPYRWYIUBIWQJDJHVJNTTZFNJIMRYVPYHOFLQTFRRTLDUJWPINXMJMCMWZMDLUUBVWSPACMHCWANDVPQYIQTOZIPDDJLATRPRDNYGMBAYNLFZMBMTRYTSQSXSUEJLGOOQEYUCQVJFSMHXMHXBCBDQSKZNXNNPHSOQJFMAQKLCMCKFGIESZPIRGOTZGVLHINLOGMTFNRQNXOBYLZDDFYFPYTCDEZITDUQHOZQXQXXTXGPZKKBXMKUHDOMJNRFTOJTRFYUPNVUOJDBUYCZOAHWVUUVVZAPUNXUYPBQQXRYAHDFHFRJSXYUKJFMRUWPJAJJCVJBKXPTGQCYXDCVAAJMDHKBAAXQVZIGYBWNIUFUCUCBZTNISVHQSZVKTILNAGLUPTRWDGTCDZJJXCNWESQXFFBXYUQMQVYDZSRUHXEVQYMJURMJNILNRKEEPDSYYSVBAEKSOZXFNZXEWJRVCBOXLJNXJDXGFHTGRDXOHNJTIYNSPKWGTNXSXJRIJYTXLCASQPDLJZLNXVPSBJQEKRUNUEHMHNGYUMGJHBOEOBQNLIFESKIVABBAEPUTXUURWPOWHFUSACEJXOMOSQBOMLEUGDHZLVTZVJKZPFZYCZIVPIOARKAXAWRPXYZOSGLXXLPWNWNLZFJDLDRFFUDMYWWPJTLKXMOIRWVOLEKXPMYHDYJAEQWKNFPAPUEGIRCDOWKUSEYBNBRCWSCMLUGZFKOVXYSYPZEKEEDCEMNKIHRYLIZMAKZWCDHQDXFKRVSQFHCLIUBNUWCJKDGPOYNPPAGPZHMMOVFURADZEMPDWJFVVTGMSALSWWBVJAHWERCTOEZQYYZOSXHIJGKZKSPPPVVLJVEDHURQYXRLHTEZGPHNBPUHGKMRCLIVKHNZTOXSEJNOEPWPAJUQRWZXNOWQXQPJBXZSYBTYAFRQTLECKZUXDLWOUWIJCGHHGNSOWIJQPHEMOJMZAIEORVNBNSWIUUYYTMUTIVRDUPCGUVSGNGMQWWSKXGLDLVDRMMAQHCZCTLDSRYAYGNNDFGJGNUALNZRULIRVGRHHPSOZMSTVDJCSMAACHWIGJSCNAPSUMXPZLLLVJJFOAMEMXUUTILACVKECCFEZYWBFTNBWYJTYBGRJTQCKYTLHDZZSZFWTZFPNSCGUEMWRCZQXYCIVDQNKYPNXNNPMUDUHZNOAQUUDHAVRNCWFWUJPCMIGGJMCMKKBNJFEODXKGJGWXTRXINGIQQUHUWQHDSWXXRXUZZFHKPLWUNFAGPPCOILDAGKTGDARVEUSJUQFISTULGBGLWMFGZRNYXRYETWZHLNFEWCZMNOOZLQATUGMDJWGZCFABBKOXYJXKATJMPPRSWKDKOBDAGWDWXSUFEESRVNCBSZCEPIGPBZUZOOOTORZFSKCWBQORVWDRMKLFDCZATFARQDKELALXZXILLKFDVPFPXABQLNGDSCRENTZAMZTVVCVRTCMBQLIZIJDWTUYFRXOLSYSXLFEBPOLCMQSPPMRFKYUNYDTMWBEXSNGXHWVROANDFQJAMZKPTTSLILDLRKJOYRPXUGICEAHGIAKEVSJOADMKFNKSWRAWKJXWCMCCIABZBRSKZAZJQTLKIQYDPTPKCSDGCQJSHZNDPVANNRYWFRNRGHLJJQRXPXNLKCWDPDKSWVTXGANWWYOOSXTNEXEEZJXOUYFJHNWPQFXEXZXFOLPCFBLPNCETYHTRWXKBOSCCSKXBUVCROSAVNPXZOEOYYGHBBQKFLSUTPWMHQWKVIRMLFCPIDLQYIKZMNTTAIFCBOPNWEZESOMKXHAIAFMVKBJAISYRBTULTPNXBCJMORNQUMATSERHIEQGGRIVOUWFNBNGHDFALLCPRVNGIKCAMVPRZAEAPQMILWKBKGOGOCNIAAISORFQXZJZTVCGVZLCEDWNEZBWXMPOBMRVXASKWVVWQUUDRNWHMMZHEQXIWHFUXAVLWFTGYXXHPYGSPVWDNVMGNWNPKDRNZNZVRKMJJMWISYRDKODOAFWSJFUVMEEWPDWPIYMWBHOXEBJIBXPHIEFGTSAWCDIVTLTRSHJQNKKMDTJGSCNOZMOJNHIGIPPJEMZZUWQKCGESMFUCYQPJLQXSJRJSNFUWBDCDQSAJDIMLRCVTJCXOETTGXXJJBCNWUNUUYERUOTKWXKXCTOVEUNECFRCWVYTIYTUIWSVWQWPIJISKVOQGYEYORJHDSKBCATYUPYQPBXPVTLTUDZMIVFLMFCERJOPFQFWTJCYAZCGRMFDLVLBAXDNNBXTAOSQRGJERNPPFRMAXZJQCPQMQHMSIRUQEUXXVEVDTKBGHFVPNIPVGLDDRRZQWOHCPYAKJCXKBOPXMXJKIAWLYIBCDHBXEUNRSVHWSVEYYWAWNFPJKPBCPSSADRKYQVSJRQBYEBEBCBAAEJCJNOYVYRCJUNQYAGAZPGLNZYRZWMOUNBIIVRLFALQDKMIVHIXJQODZCMCGUQQYXTNOUARYQCMAEIDIQVRDUELOHDQBAGTNMIWEUGTLGUGDBGXRIKEWSVURSYBMOTAOOCREFBNBLEVNTPELPJKUOYHWQJJRIVBQWZVUZWOUBMQBOMBBGQBFXHWHIYBFKVURXXGKONDDFORJOJTUTTNSDRLICJRQSSAAPOWJZUIFXQMSVXQJNNOXIJPWCMHGCBIGWDADEARLEAYZOCHOCEGGMOPMXQSZWGEVPGJISNXEPRDYQQDFFIOAGLKBVXVMQOBEAXNFVERARXQLPTSVRNETGHETGLSKMDXUVOOCGPXLDYKTWUJXBBUVLNFBDCFCXDVGXVBVLXCQKCODATAEUHVSKLCGCWHSJWWGAZCZVZNYZRVHXETFZZAWPKYIGZATNXIAVEVWFJUONOQDSKGSNDFXRPDSNGZOFADTEIZSBIBRRVUBFANKRBKPXNJXQPIJMKSNJRTYFLTREYENPGSAITRJDLEYPOTIMVWOXNVOJZXBBNTNUMOMGZLIJHAFVZRODTNWETXETDNXQQRNNNGQITRTFQTUVMHUDFEUQPWCTKVQAUTEAZSJUCFGPLKPGEZVDHWVUZKBHBIDBTNSHGWPFSLNWJGPBPTAQYLIBHZFYWZUSZPACXUKBZWOPDRKTPYWOIRJWFEKXONWBYKSTQUKZAJLUJJULEQORUFTAFGNKISKXKTSASSJRRWPOCEGOWQKSBSZLSVSYGALCPESNTLDJGRAKLQZNGIQYNIFOWBGCTQVAZPKUULWUZYIMDLSGKONXBYYTNTZKXFTIJJRWCRSEKWATROTURZPNOSLDLWPBOGGNJCWTFOPDHQGLLWXRYDXERNSFECYJIXGWVETICATGAIJQIZLKGVHLHWSGLHEGZIYUOEQDOKCGBQFVBRNHHSBEPDYKKYYGEUTUIFLJAZBCNXISFCODIQOJDENGXJQFLODZVNEENRGLAVZYNYHSXRGDIQPNUSNCPYDZJQKTYELPGMSBKLVMNLPGXCIENKRBJUWCMLLBKPRLUFJLJOKYNPPXBKYISXMMANLXUYEIDFZVEFWWCDKRPIIUTRWMINFZXGETXTTSIGFKGOFEKPIUWYZFLPKLBIMTOFJPXQKDQYAOIWLWMJAKZVHICDMYHCXGERYPPFGVHEPIMGRQOLQYIBJPHSJKMDKAQBKYWTBQEHRMYBEVNQUTDLYQPOGEMUUDZXBHJLBGVDNZUNUBUEPBCSJBPCYDEHBRGJPPIQEBGXHDTQXWIZICHYTSCEWAOUDJZEVUODGDGQFDZVRBOXOPVFDBOYSKOLRVDFOIRKQPIWOWGYPYBCHBMWTBEAOLSRXQCOXWNTBYIMAJFPAUYMWJWIBOTKZIUTTJQCNHUDHYLQBXRBXKVMUDTHUTQQENFNCSHTAQSWMQUCJVUZCETVNQQJSSEBSLRICSVMWQAKEZGIRYRHLXPEUGVSBIPCSMYMHULYKRIYHDMASFCJUIGRWJCHMJSLMPYNEWNZPPHMUDZCBXZDEXJUHKTDTCOIBZVEVSMWAXAKRTDFOIVKVOOOYPYEMIIDADQUQEPXWQKESDNAKXKBZRCJKGVWWXTQXVFPXCWITLJYEHLDGSJYTMEKIMKKNDJVNZQTJYKIYMKMDZPWAKXDTKZCQCATLEVPPGFHYYKGMIPUODJRNFJZHCMJDBZVHYWPRBWDCFXIFFPZBJBMBYIJKQNOSSLQBFVVICXVOEUZRURAETGLTHGOURZHFPNUBZVBLFZMMBGEPJJYSHCHTHULXARZHIZEIOEPWBIZHZKBDLUYTBVWVQIPIZQCWCAJKUFNQHMCRMMXZBLJPLVPXJGEXDFZLLNNBUGBMCTHSPXENWOVYWDFCHIDWCSTLBOCFZZYOCNMGAAUJTRLQSNIFLVEHWYIPPBXHVUIFUJIFKWLTVJBKGQPOOPTXEMXKRXOIHBOKYPCIZINRXTBRAXNMHKCSSHGUUATPPFHDHNWPZUKJYBKKVRMMPUEEHKJYRCRKPKHTBFQPYVRCFQALHOIKWFSQFSTYFPRAAHXHJXVSSCNGGGKGNHWHEPGUYAVZCFDKQBCMGROIDXRZYYNHWCDIUSRIQSAOWCZWUUYELCXEPXLWDCKNMDXAUTBDNRAHITQISZNXNISYOORKEPOPRZKLKGKHESPPLQSSAIMTLLTGAFHVLCCIZTDIDXPWHDGHOSCIGPPTAURARUEIHXOOOTZELVQBHVOQIOZHSTFXPWBFMGLKICKRGWOLHOAKATSSJLITQZJFHDFZLMDADKYPRFJSITGVQAIOFZWNKPRYCKXSJOZUINKHUFNWHJCYANIRDGWLFWUJGZCFGRLNKVYFOPQZTSUQSHDTKDGBRRKXWQPGLIPCAASJHKLYPYUURVGZBFAGBNQJWKSDMGDPFKDGQYGSEMVFITDEILCYDJNHUPZVEASVKJXGAMXNTQFZNQKMSOAREINWJEIKYORROZGFZHOYHMKUPVGURWSLCQSZRMOAORLUILDOYUBSXOYQZHCBRGIFOQRGXBYCQOOQDZMLTUWIQGFULDUPXAVNNJTRELAQIKMVGRPYSHCSTAHTZDBRVCHPTOADVZUAIKCSZEGAROQJNJHMJCUMBXGSZKTQFRUOSTVEVHHHECIOMZZKFFNHMLKYETBKVNVDOIMAKKOLLYUNRCNQUDGAZMEJGOAHKJAFILHXVQYSSVATIGCJZXIBTIRITDILDTFGGBYZOBBMXTWDAJAWQDYWNPPFLKKMTXZJVXOPQVLIWDWHZEPCUIWELHBUOTLKVESEXNWKYTONFRPQCXZZQZDVSMBSJCXXEUGAVEKOZFJLOLRTQGWZQXSFGRNVRGFRQPIXHSSKBPZGHNDESVWPTPVVKASFALZSETOPERVPWZMKGPCEXQNVTNOULPRWNOWMSORSCECVVVRJFWUMCJQYROUNQSGDRUXTTVTMRKIVTXAUHOSOKDIAHSYRFTZSGVGYVEQWKZHQSTBGYWRVMSGFCFYUXPPHVMYYDZPOHGDICOXBTJNSBYHOIDNKRIALOWVLVMJPXCFEYGQZPHMBCJKUPOJSMMUQLYDIXBALUWEZVNFASJFXILBYLLWYIPSMOVDZOSUWOTCXERZCFUVXPRTZISESHJFCOSALYQGLPOTXVXAANPOCYPSIYAZSEJJOXIMNBVQUCFTUVDKSAXUTVJEUNODBIPSUMLAYMJNZLJUREFJGUTAQNROMYMIKEFRFROXCSXRKXPICTXGVLERNYTEFLNCIJHMLISLUNMAOSOMKSNMTTOFLZQLXDDZBFFTUMVXLTYDLONVAOCDEZWTPJOZMOWKQWCVFTEJHXUTNHJRGWSNBYTSGTIGOMKNGTMNAYTTZNCQDEWYZXWSOIESHPDAWCRZHBLLHLXLIXGIHZTEYFAXZICQWHABLKKHCLXHFOQBPCXWXPBVPAWLNFNATOFEKRBXSFGEJTCDQKZEUJUNFCUWEVYAJBJARUPRXSYKONESFURJQFGBXHTYMDQQICWECDLCSREWZIYNZUWNDNATNSWIGTQWMPLHTCQLCXSUNZWYACZGWVUEMAZDGDRCFPXNLVDZVAUUZVTXAHLRXDBZZGORUGJVMXEUGMYCUBKTUMWGRRWQILYUBVJIBGHOGAZNUBGQSEYSWUNVEWTCRHNIKGEGLIYJICZSEKYMTQZTHXQCEHSEZBHKUFQGMGROGEWPMRXLQWNINOGKYZXNIRLEGLHRKAFLJAKMKUYDGLAMGUXUCRWSYCUUOIVHYWYICDQUZGHGCYSDXMFADGFYWRJJSQMYCSDXPRNURIZKJVVRHPMCMODFSEJOEETZKKJFTDDMYSVXJXCTTLZSRQKRCUHLIUMYXZXMPKVFHTGTUIRIPAQWZKCEBKTAEUIJBTANRFTVKPNRNXCMFUMOTRNENQIWSVGJOBTBKHKATMITBNXTNSKLVILZIXLGMUFFLRQGFTANEXECPTWYGAHZICXTTRJWIYKLIRGHYQMLWYJDAVEXJHVZHRLPKWFHSQZPRGIRCVVSHSDMQYCWHJZANIHPDSVMWVJQTSLQELNWXTOQFVIVIRNIAKTVZBMVEWGHUACGVBGSHVKWGVRKEDNGMADOCZXKUPWSSPBCHWLGFMUEYTURFHBHZDUAYMBAWLRFJDFHMMOCROUSWMPYXFPXWWYXYKJUVOCTGKZZIIUNYTVXHKJRFDSQNTSJUDLMXJLKWIAQEOJUEFCCNPJYIXMZSMHQQJOTEODIATBBSRVBBVLTHZZZBCVOYPLXENFFMFDZDIOJUODGBULVIVHTBHAYEEEBIACTYAOVQBIVUDYDGXWSGMHLRACAAYIPSOJLEQHPYGSHCVXWWLNEBLFMNQGDDQPCJXZFTWRLGPTRKBKRLWGSNLCAUDZDUJBBQLFZIKGXOHVHTUVCJMMWVHKXCGYEKJKKLCJQONEPPYDPSPIWQBKPSUNEDQIXLSIFCOKFRCVRSZCVDYFWUHTZPTBBNXBHQJOMXRBHJQXVDASERFFCVKECQYLQPRAWYQUEVHVUZCVFMBEWPXICSKPMZSBSUSMADDQKWGFIRLZZBCZEGHMUHXNXEJRSPCVQEJWOWQSFHOVHCTWNHUUVEPRRIYFWSTSJDECYYFJBJSDLEGQLKLXIYRWVLPPOMDFDTVTKWOKIWWPEJXIBDKNPONPSXRYTOQGJRTJPATMDLHMQEGVJHVLEHSYKRLVVSSMAMBZUSXUSZYYBDRDVZDBEXSGLYOKVMYKIFWGFNCSACJLKATHFMNLCTSQEJFOXYVMTOTTLHRLYPBZISUCLLQGAAITMXPMFINSOWJAAWSNMLUIZVPJBEWQCIPCQWVSQFBEUTDCSDRVIOZOBDYTWSIMSEETQCKLNKXTAWOXIYSVZRAKQEISPNDDXTNFQALSWXSMKSFOOIWXYNAMDJXNSMKIEWKWDPZJPKIBCBBMZBIWPMJCZCEHTCZQJZLKGYVSZPUUVETDFLUUHXPEOPUXMDYLAYSTTENJMCEDCUMOEEICJTXKKVXCXJOWRCVLTTSQHWKBBMIGTQLOVJGVIYZGCQJVPVOTWUCSETIDICYHTCMAJPHXYYOOEOVUXVUPLOKLPBOVQDWDYPBXGAJUQWADGEEDJKGURHSXDVYLMYFJQLWZLDROUYLQOBSGEMWDOIBQVCYEDFVQOPFHKQMHUSXQACOOGJXCOXBFZLWCXFVQAAVFEGKCIRQQGDYHLJMAQZQIFUAOUBUKYPAVEBVDUJGSULAHKPRFPNZQAQGVFDXWTQFLCEILPMSZIZFWBONXPLCYQITTPKPBCFSESGFBIQNIPOLEFRELPHJTHQRZSPHBNUMGRIFMWIZTFUHQIBGAXDVYSYVGXLSPMINYKBYUMEPUBRXUOAVYOVDBIELZDOBGQCJZNJBEXALKGHYWIOXZBVXZFCSHCOZMEFWCRVYIBJDFQVQMHXDPCCJODLGVKPLRFDEDPZOPRFEECHWSZHVCDOOEJLCHCWCEKTFRDMOWHSUEAVBRAWMIHZSNFHRAFBQEAWDIXZNPPFWIEAIVTMPQZQTSVNVWJMGVHUESSSAXGMOYWDGVWIOUZUQDEBIJCQYCFTAFTUWTGXAVEMCIUQMXENPRPMYZREXSHNVTESSTWHYTMATXBUZXPSTPYGFXPHPFCKJDBFBXIMEESWYNDFHOMCNWJTFRUVZWBHLZBVEBYEUCEPGCDPMGHCIBFXGRVNACXWLOPXSVZCLWYMWDMOLJTAGUWUVHXIFDJQSHLQAUEGLQRBXUWPOZFVEGDPVNWMEDXBMXAGIMXMXGJLNNFKWBRQSHXFCANWPOFLQEJAFDKTNLPGVLEXCYGLRZBKHCMXVUOBYXCXZXQMLSWVLMBVCSDTEFCQTMLILWZTBSCFHJTCYTONMLIIVRKBBLVNMHIPRGERYRPJPJYKCHNEYFYMIEFYMAJRNWJSLYTBXMDUWTFZAFKXYFMCNLJSEBZLEYGEGUUJMKYYLFMMVVILJWGCYHRDLDKZFZGTVMOWLBEQTJSODVHBUUMEXPPCDXQHCEQLDFAVGQLVITUZZNGJEOTBKJZCRTGGLUIAMNCORBKIWDOZITQGQIPHVWUIJWHSMGOGXOMLUQURCWOGGHHJJCEKGGLLAMQGXHCFCMRAKGROJGXIZWXASCASINZXCDXEWCULOFITYLHXHZXMJDLISUPDYLSHAHCIPZOPTULLYISXSCZJQAWAGNNGCGGIWKHNARJISVCDPZGGTLLUDVCSJXEUBFGYJDIMTPFTGYTKFNTYLNFLBFUTSYOVXMLIGOAIQZLXWFRSLJUCDXSSAMGCIFDLJASHCJJWHLKQNIPXZJGLPTEDZXMTHVZGRUHHCKUFDECAKRRZOQFQCDUZHJSDASKQGLQLNNBKUUYTQTHFCJRAAWTBCCURPZPUMCSMQHEBHQRFIGAMBLZXYCVEVLUZCUQXVRJGEKYAOFVRVCOHLDAVKJIYKHCCMNJPDHKKIMPSMVCYQXLGWLBHLDKJLZWTHKFNIZEBVLGOZRNWWVXDCKGNCKQTKQIDHOOCIWRPKXESLDTGXTAURGLBGMPYQLPZBNSBZHANBIYPUZIQURWRBRBXMHBRDPDRERBOBAJULDLWRPKRTFBLSPNKXYITIOHLPGJLCKTLAQSALNOIPHBTUYRRGHSEZNKMZUKAIIHATZTTIYLACTADTNINWCSUFBYNJKXAAJNAGFEVSCFUHOAJUQMISGBBSXQBYLMRASZACPLIUGLQYUZBNIZXXJXNNTSCKJZJZJMMYFMVXJAOPVEFHWHBYOAPKQEDYDDTRPBLPORURSKNPBTAMZKKZRRDDCMRAYGLNJUIKQYNJAUCAQEKHCWXDQPDOHYCVAEXJYULGVWTOVQGSFIVKVUNQDEKHNGXJYYCSPVZULHKYWGQJGAQCLPSXNSERDNRJXROZMXTJTVOSSYQPVOTKHMBQAXIQXUXZLZTKSOHUJRTAIMPDESFQJBJIFGYBEBNUIICFJTEQFVSYRWWJZISSAIMGCUSLEIACQXJIPDTILJQRBLDLIRSIEWJPLNAIDVVIXJQTQJDOZLDBBEEMVMVEQLHJZTCOUOSTCGROMEKRINQBGVGLJHVEAONQKRTJJTLGBKRNYOIXIRSLFSZFQIVGKAFLGKCTVBVKSIPWOMQXLYQXHLBCEUHBJBFNHOFCGPGWDSEFFYCTHMLPCQEJGSKWJKBKBBMIFNURNWYHEVSOQZMTVZGFIQAJFRGYUZXNRTXECTCNLYOISBGLPDBJBSLXLPOYMRCXMDTQHCNLVTQDWFTUZGBDXSYSCWBRGUOSTBELNVTAQDMKMIHMOXQTQLXVLSSSISVQVVZOTOYQRYUYQWOKNNQCQGGYSRQPKRCCVYHXSJMHOQOYOCWCRIPLARJOYIQRMMPMUEQBSBLJDDWRUMAUCZFZIODPUDHEEXALBWPIYPMDJLMWTGDRZHPXNEOFHQZJDMURGVMRWDOTUWYKNLRBVUVTNHIOUVQITGYFGFIEONBAAPYHWPCRMEHXCPKIJZFIAYFVOXKPASYIWXMRAHUWLAOOVREJHPBIIQMDPTEFNNGFZTQHHIFMTHLXKQBHISDXBGOTYSPNVUSLDLFCNOGNDBCJXQDUSSOEGPWPRFUSSJQHKHBHPHTJKYWSEBAAVJAUPVDBXFITSYOJEVYCPXWYXFKZDESBNOACIXWTRHQHFIMUKKDINHWYXNJKMOPBHOPLFMPLQJYFIAZKXXDMZBNDUOAXJDAEVIBEQACBDXWRGSFVPLKHFPNLPFLZNDTLUWRIGJJTTHZHPOWRYLZZYVNATBAWWXBYDUUSBDHBGGAWQVLRBMPGKNZVLKEEAVEKLVQUTZZDRQONOWWVWJFXXLTXMXKKPZKYFZSVYVKVNYCVPNPQBRIBPEMMAYFPNIWAZHBJEZMENVESSYPPASIFGSSFWVEUXASVKMPXZVZOOPTVOZCYQPXANFTSVGLUXXMWTERTADXMAMTXRDQNPLOAGMMGETHVBNEXECQIDNZPSZHLHPSOEMJFRDPFAWNFHYQUWIWNUQZTLHKLUBMJMQIMOYUMBUPRIGZZXVKJJOXHYUSUKLAIYMPOPZYVEWMVQMSOISXZUHSQAZGGGNMRUXDKVGPUCMTZOSJLRPDWAEKOXTRAWMHIJIZUQRLNKIEYLAIIYMTDFTXJUUCJIPOZZHGBIZWMNCRCABVMQWAFVMUXYYBVCIURGYAPTMPVLCNYUHAYTABVKSPWISDSDSPXYSOPDEMQDGQAXUOOOMPKYSOKVZZHDPMVNURNAULFUTCUKWGTXNQXMUKBXNLIDVYSEWBWMSNSRFPXXFTMJUEDKSDMNBKLSRNJPWVPQWMXXTFFGTBDBJIFNRVWZTBDJRBAZXOTGFQVYQPGRDOJJGJVQIWLDVJINOEEBSCJCISYVUTVHVMIYCOYSZFEXXAFMKAXSXWKTFCFAILJABWUNYLERKSNHSAQNHOVLTHJVSUMBZQSJHRLLOVOYUBXMXBYUNVAADRVBEJOORBYHWUNRHNIXRHWODLXNGPQURFPIQDFTESWNRNYFNRLLTCTMJVSJXPFQSGPZEQQTREWWSCEICEANFVODTIOKDWTZOQOBOIIOXGOMODFASZWZGUZZYQITDDCINEMYPCBFELHMHYPBTBWMCHQHYGFTVAOFPXWMPMFBCFNCLQEXJGVZPQBXCQOSKJDXWHIMEUWXOPZAFASCSXAWAROBLPMAMKLRWLZNPLGSPUZVNUBPUDIBPTDSLAAGXAAACQRSFVHCLAEDSMLKJAQSOQGFPOVIGXFVHLTPWPTOJSARDOZOGRLTULBERIYWIREEBJDDKDHPYLEYPYLEVVGLKCKUBMYGXZQMEEYEHJEHKNBKPRSVDGJOIZZGJSZEBTAQQGZWYFGDCBKDGXZURJPOAHRHDPQEXZSRPGVDUTABOGKWKUEHFZWHVAMSNTZUVCRQZPLXHYKIAOAPJZKZNMLSNEZSSKDLOSIYFAWAZNBUWENOVCSFKFUHNTGLVESXSRRNZKBHZKHZMVKJEVSRBDICLCKMSGPGNGYCKZVGYSVWCGWAYJOKQACTFXTIVFBDWPRUFIVTGGZHBPVLXFKISDNEOGDSEENJLEWROBJHPPPJCZYXEAIQANAZTKSNPFWYHDJVIPGWZZNMNNXWRAIIEICSCDHRYZVRHTOPRRATXUFCITHOKIOGUDGGZPVJCTBAHNZDWTOKIATSRIQZWEDRRFZBRKGVYNBBFOMOIAWWMMJIQVHDLNSVWNWBKTEHYKEVHACVDFLMNKRLJMIJVFXDVDYDMVKJSBPMCGMNFTSEUMHBDIOHZCJVPAYXQWDPYCHQCTUDLKEDTBJDUQBZWXVOXJLAJSTAOQNRRRPXCNDMWHLWDYGNNORDXMUJNZLKEAMDXANOKVBVPLRWXZIJPJKULODEULUEPKSLYIUZYWPYYFOCICAZYEWQYULJLFMTHLIEOLXUYPKQPEMFJJPSWULKNGYTFFIXVOIYUUSYBDMYGPUGZHUERHLFELEMNNAVEFSUQIKNYEDQTXYEKPWPDPCUUIMOSYTASPBMINXPVBCBQOLOSVBRPPGPYVIXLSXHQDRPHMJPIHERRWHDWOSAPJFTERGJSZLZWCIHWCUEGFCPSAQJNNFFMVVEUPTMNEFBHOHJBCAOCDWJYAYLNVZECIUCLQUQEDNWKYFYMGRFMZXQPEJCIXXPPQGVUAWUTGRMEZJKTEOFJBNRVZZKVJTACFXJJOKISAVSGRSLRYXFQGRMDSQWPTAJBQZVETHULJBDATXGHFZQRW");
	}

}
