erase image.jpg
erase biodata.csv
erase signature.jpg
erase reading_ektp.log
erase riwayat_transaksi.log


adb pull /data/data/com.inti.ektpreader/files/riwayat_transaksi.log
adb pull /data/data/com.inti.ektpreader/files/reading_ektp.log
adb pull /data/image.jpg
adb pull /data/signature.jpg
adb pull /data/biodata.csv
