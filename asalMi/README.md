bolen değerini girilen sayıdan (sayi) bir önceki sayı ile başlatıp 1'e kadar gidiyoruz.
çünkü,girilen sayının(sayi) bütün bölenlerini kendisi ve kendisinden küçük sayılardan bazıları ouşturur.
ancak biz kendisine ve 1'e bölünüp bölünmediğini kontrol etmeyeceğiz.çünkü sayılar kendisine ve 1'e bölünür,
1'e kadar olan sayılardan böleni varsa [" if (num%bolen==0){return false;}" bloğuna girer] dolayısıyla sayı asal olmaz.
eğer 1'e kadar hiç bir bloğa girmezse doğal olarak "if(bolen==1){return true;}" bloğuna girecek.
yani sayının (sayi) 1'e kadar hiçbir böleni yoktur sayı asaldır.
        
