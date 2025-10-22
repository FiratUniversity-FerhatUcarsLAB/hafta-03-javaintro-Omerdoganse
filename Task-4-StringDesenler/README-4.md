4.1 - İsim Kartı:

İstenen: Öğrencinin kendi Ad, Soyad, Öğrenci Numarası ve Bölüm bilgilerini içeren bir "isim kartı" tasarlayıp ekrana yazdırması. Bu kartın "güzel bir formatta" olması isteniyor.

Amaç ve Öğrenim Hedefleri:

String Birleştirme: Bu adımın temel amacı, + operatörünün sayılar için toplama yaparken, metinler (String'ler) için "birleştirme" işlevi gördüğünü öğretmektir. Örneğin, "Ad: " + adDegiskeni gibi bir ifadeyle sabit bir metinle bir değişkenin değeri birleştirilir.

Temel Formatlama: "Güzel bir format" ifadesi, öğrencileri sadece verileri alt alta yazdırmanın ötesine geçmeye teşvik eder. Çıktının başına ve sonuna çizgiler (---) veya yıldızlar (***) ekleyerek bir çerçeve oluşturmak gibi basit tasarımlar yapmaları beklenir.

Teknik Beklenti: Her bir bilgi için (Ad, Soyad vb.) ayrı String değişkenlerinin tanımlanması. Ardından System.out.println() komutları içinde bu değişkenlerin açıklayıcı etiketlerle birleştirilerek düzenli bir şekilde ekrana basılmasıdır.

4.2 - ASCII Art:

İstenen: Öğrencinin, kendi isminin baş harfini, klavyedeki karakterleri (harfler, semboller, boşluklar) kullanarak ekranda çizmesidir.

Amaç ve Öğrenim Hedefleri: Bu görev, "Görev 1.3 - Desen Çizme" alıştırmasının kişiselleştirilmiş bir tekrarıdır. Öğrencinin, metin çıktısı üzerindeki tam kontrolünü pekiştirir. Programın sadece veri işlemekle kalmayıp, aynı zamanda basit görseller ve sanatsal çıktılar üretebileceği fikrini verir. Yaratıcılığı teşvik eder.

Teknik Beklenti: Bir dizi System.out.println() komutunun kullanılması. Her bir komut, çizilecek harfin bir satırını temsil edecek şekilde, dikkatlice yerleştirilmiş karakterler ve boşluklar içeren bir String'i ekrana yazdıracaktır.

4.3 - Hesap Özeti:

İstenen: Bir alışveriş listesi oluşturulması ve bu listenin Ürün, miktar, fiyat bilgilerini içerecek şekilde tablo formatında gösterilmesi.

Amaç ve Öğrenim Hedefleri:

Gelişmiş Formatlama (Hizalama): Bu, görevlerin en zorlayıcı formatlama adımıdır. Konsol ekranında metni sütunlar halinde hizalamayı öğretir.

Kaçış Dizileri (Escape Sequences): Öğrencileri, metin içinde özel anlamları olan karakterleri kullanmaya yönlendirir. Tablo formatı için en yaygın yöntem, sütunlar arasında boşluk bırakmak için kullanılan tab karakteridir (\t). Bu, öğrencilere \n (yeni satır) ve \t (tab) gibi "kaçış dizilerinin" gücünü gösterir.

Veri Türlerini Birleştirme: Bu adımda metinsel veriler ("Ürün Adı") ile sayısal veriler ("miktar", "fiyat") aynı satırda ve düzenli bir formatta birleştirilir.

Teknik Beklenti: Önce başlık satırının ("Ürün\tMiktar\tFiyat") yazdırılması beklenir. Ardından, her bir ürün için, ürün adı, miktarı ve fiyatı aralarına \t karakteri konularak birleştirilir ve println ile ekrana yazdırılır. Bu sayede tüm satırlar dikey olarak hizalanmış sütunlar oluşturur.