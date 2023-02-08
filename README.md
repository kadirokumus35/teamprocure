# teamprocure sign-up test<hr/>

cloud.teamprocure adresine gidip sign-up olma durumunun test edilmesi hakkında:<br>
Oncelikle manual olarak hedef adrese gidilip gerekli testler yapildi ve raporu "hatalar/tavsiyeler" basligi altinda listelendi<br><br>
Sign-up olma durumunun HappyPath test modulu otomate edilerek raporlari, ekran goruntuleri ve pass videosu eklendi.<br>
Ayrica test otomasyonu esnasinda karsilasilan zorluklar ve cozum uretimleri de ek bilgi olarak eklendi<br><br>

* HappyPath test otomasyonu icin Java programlama dili kullanilarak proje insa icin maven repo kullanildi<br>
* Manual test ile ortaya cikarilan Test Case Stepleri Selenium suit ve TestNG frameworku ile otomate edildi<br>
* OOP prensiplerine uygun, POM dizayninda proje insaa edilip HappyPath test oldugundan son adimda Hard Assertion ile dogrulama yapildi<br><br>

& cloud.teamprocure url adresine gidildi<br>
&	Sign-up butonuna tiklandi<br>
&	E-Mail adresi olusturuldu ve yazildi<br>
&	Kriterlere uygun password girisi yapildi<br>
&	Password onayi icin ayni karakterlerle giris yapildi<br>
&	Hizmet sartlari ve gizlilik politikasi kabul edildi<br>
&	Register butonuna tiklandi<br>
&	Hesap olusturma ekrani acildi<br>
&	Register sayfasindaki gerekli alanlar dolduruldu<br>
&	Istenilen secenekler belirlenerek isaretlendi<br>
&	Istenilen olcu ve para birimi standartlari secildi<br>
&	Sign-up tamamlandi<br>
&	Basarili bir sekilde Sign-up saglanip dashboard ekraninin acildigi dogrulandi<br><br>

![Ekran Görüntüsü (7)](https://user-images.githubusercontent.com/100091154/217390902-10a0ac66-10b3-4c91-9f17-5e6355722ed8.png)


### pages dosyasi <br/>
bu dosyamizda elimizde bulunan sitenin testlerini gerceklestirecegim elementlerin locatelerini sakladıgim classim bulunmakta.
İstedigim locate almak icin olusturdugum classin adinda constructar olusturdum ve icine <b> PageFactory </b> classini cagirip
icerisine olusturdugum driveri cagirip burada olduğunu belli ettigim <b> this </b> key kullanildi. Locatelerimi cagirabilinmek için de <b> @FindBy </b> notasyonu ile locatelerimi olusturdum<br><br>

### tests dosyasi <br/>
tests classimda TestNG'de rapor almak icin TestBaseRapor class ile extends yaparak parent-child iliskisi kurdum. Her aksiyon sonrasi yaptigim islemleri raporladim.<br><br>

### utilities dosyası <br/>
yardimci classimiz. Bu dosyamda sürekli lazim olan classlarimiz ve methodlarimiz bulunmaktadir. İcerisinde  projemi daha anlasilir hale getirecek classlarim ve methodlarim var bunlar
<b> Driver.class </b> , <b> ConfigReader.class </b> , <b> ReusableMehod.class </b> , <b> TestBaseRapor.class </b> bulunmaktadir. <br><br>

### <b> configuration.properties </b>
properties dosyamda sürekli kullandıigim variablelarim bulunmakta , bu veriabları kullanmak için properties dosyası <b> Key  =  value </b> olarak oluşturulmakta buradaki bilgileri baska classlara cagirabilmek icin utilities dosyasindan
<b> ConfigReader </b> classi cagirilarak icindeki method sayesinde bu dosyada bulunan bilgileri istediğim yere cagirabildim<br><br>

## pom.xml
bu dosyada kullanmak istedigim kodlarin kutuphanesini  <b> dependencies </b> taginin icerisine yerlestirip guncel bilgilerini sürekli olarak kullanmayi amacladim. Burası sayesinde tum kodlara erisim sagladim<br><br>

<hr/>

# Selenium Testi

<br/>

Java11  ve Maven projesi olusturulup TestNG framework kullanilarak olusturulmustur

<br/>

<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="50" height="50"/> </a>
<a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a>
<a href="https://www.selenium.com" target="_blank" rel="noreferrer"> <img src="https://camo.githubusercontent.com/4b95df4d6ca7a01afc25d27159804dc5a7d0df41d8131aaf50c9f84847dfda21/68747470733a2f2f73656c656e69756d2e6465762f696d616765732f73656c656e69756d5f6c6f676f5f7371756172655f677265656e2e706e67" alt="Selenium" width="50" height="50"/> </a>
<a href="https://www.intelj.com" target="_blank" rel="noreferrer"> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQak-N8W03mK25slV1lwM80i0y1obRPPJOaLA&usqp=CAU" alt="intelj" width="80" height="40"/> </a>
<a href="https://www.maven.com" target="_blank" rel="noreferrer"> <img src="https://koraypeker.com/wp-content/uploads/2018/06/1_xsrKVt69q3JsZzLD-ldekQ.jpeg" alt="git" width="100" height="40"/> </a>
<br>
<br>
Her adimda alinan ekran goruntuleri "target" dosyasi icinde "Screenshots" klasoru icinde yer almaktadir.<br> 
Buraya sadece pass olan rapor gorselini ekliyorum<br><br>
![Ekran Görüntüsü (8)](https://user-images.githubusercontent.com/100091154/217393845-7e2f5063-83b7-4ee8-b224-07bb2acd23f5.png)<br><br>
Pass videosu da <br><br>


https://user-images.githubusercontent.com/100091154/217395287-5cb3e8b8-9db5-45ea-a27b-bb6b0de8b14e.mp4


