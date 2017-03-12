# language: tr
Özellik: BASIN İŞ KANUNUNDA KIDEM TAZMİNATI
  Senaryo: Çalışanın çalışma süresi 5 seneden fazlaysa
    Diyelim ki ihbar tazminatının hesaplanması için gerekli çalışan bilgileri
      |anahtarlar         | bilgiler    |
      |işten giriş tarihi | 15.01.2011  |
      |işten çıkış tarihi | 28.04.2016  |
      |brüt ücret         | 4250        |
    Eğer ki küsürat 6 aydan az ise
    O zaman çalışanın brüt ihbar, gelir vergisis, damga vergisi, net ihbar tutar bilgisi


 # DV hesaplamasi = (Brüt ücret / 1000) + 0,80
 # Net Kıdem hesaplama =  Brüt ücret  + (Brüt ücret * 0,05)


      |anahtarlar            |sonuçlar  |
      |brüt ücret            |21250     |
      |damga vergisi         |22.05     |
      |net kıdem             |22312.5   |


  Senaryo: Çalışanın çalışma süresi 5 seneden fazlaysa
    Diyelim ki ihbar tazminatının hesaplanması için gerekli çalışan bilgileri
      |anahtarlar         | bilgiler    |
      |işten giriş tarihi | 15.08.2010  |
      |işten çıkış tarihi | 28.04.2016  |
      |brüt ücret         | 4250        |
    Eğer ki küsürat 6 aydan fazla ise
    O zaman çalışanın brüt ihbar, gelir vergisis, damga vergisi, net ihbar tutar bilgisi


 # DV hesaplamasi = (Brüt ücret / 1000) + 0,80
 # Net Kıdem hesaplama =  Brüt ücret  + (Brüt ücret * 0,05)


      |anahtarlar            |sonuçlar  |
      |brüt ücret            |25500     |
      |damga vergisi         |193.55    |
      |net kıdem             |25306.45   |