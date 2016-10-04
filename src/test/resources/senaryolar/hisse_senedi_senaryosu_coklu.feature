# language: tr
Özellik: Hisse senedi eşik değerini uyarı sistemi
  Senaryo: Çalışanın çalışma süresi 5 seneden fazlaysa
    Diyelim ki ihbar tazminatının hesaplanması için gerekli çalışan bilgileri
      |anahtarlar         | bilgiler    |
      |işten giriş tarihi | 01.11.1990  |
      |işten çıkış tarihi | 31.07.2016  |
      |brüt ücret         | 4250        |
    Eğer ki çalışma süresi 5 seneden fazlaysa
    O zaman çalışanın brüt ihbar, gelir vergisis, damga vergisi, net ihbar tutar bilgisi


 # DV hesaplamasi = (Brüt ücret / 1000) + 0,80
 # Net Kıdem hesaplama =  Brüt ücret  + (Brüt ücret * 0,05)


      |anahtarlar            |sonuçlar  |
      |brüt ücret            |21250     |
      |damga vergisi         |22.05     |
      |net kıdem             |22312.5  |