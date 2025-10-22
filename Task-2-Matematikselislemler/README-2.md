2.1 - Toplama Serisi:

İstenen: 1'den 9'a kadar olan tam sayıların toplamını (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9) hesaplayan bir program yazılmasıdır.

Amaç: Bu adım, en temel toplama işleminin (+ operatörü) kullanımını pekiştirmeyi hedefler. Öğrenciler bu işlemi doğrudan tek bir println içinde yapabilirler (System.out.println(1+2+3...);) veya sonucu bir değişkene atayıp sonra o değişkeni ekrana yazdırabilirler. Bu, değişken kullanımına yumuşak bir geçiş sağlar.

Teknik Beklenti: Programın çıktısı olarak bu işlemin sonucu olan 45 sayısının ekranda görünmesi beklenir.

2.2 - İki İşlem Sonucu:

İstenen: Daha karmaşık, ondalıklı sayılar içeren bir bölme işleminin sonucunu hesaplamaktır.

Pay (Numerator): 9.5 * 4.5 - 2.5 * 3

Payda (Denominator): 45.5 - 3.5

Özel Şart: Sonucun ekrana 4 ondalık basamak hassasiyetinde yazdırılması gerekmektedir.

Amaç: Bu adım, öğrencilere birkaç önemli kavramı aynı anda öğretir:

Ondalıklı Sayılar: Java'da int (tamsayı) yerine double veya float gibi ondalıklı veri tiplerinin kullanımını tanıtır.

İşlem Önceliği: Programlama dillerinin, matematikte olduğu gibi çarpma/bölme işlemlerini toplama/çıkarmadan önce yaptığını (parantez kullanılmadığında) gösterir.

Çıktı Formatlama: Basit bir println komutunun ötesine geçerek, System.out.printf gibi komutlarla çıktının (örneğin ondalık basamak sayısı) nasıl formatlanacağını öğretir.

Teknik Beklenti: Önce pay ve paydanın değerleri ayrı ayrı veya tek bir ifadede hesaplanacak, sonra bölme işlemi yapılacak ve son olarak çıkan sonuç XX.XXXX formatında ekrana yazdırılacaktır.

2.3 - Faktöriyel:

İstenen: 5'in faktöriyelini (5! = 5 × 4 × 3 × 2 × 1) hesaplayan bir program yazılmasıdır.

Özel Şart: Programın sadece nihai sonucu değil, ara adımları da göstermesi gerekmektedir.

Amaç: Bu adım, bir hedefe ulaşmak için yapılan sıralı işlemleri adım adım takip etme ve gösterme mantığını kavratır. Öğrenciler, sonucu tek bir satırda hesaplamak yerine, her bir çarpma işleminin sonucunu geçici bir değişkende tutup ekrana yazdırarak ilerlemelidir. Bu, algoritma takibi ve "debugging" (hata ayıklama) için temel bir yetenek kazandırır.