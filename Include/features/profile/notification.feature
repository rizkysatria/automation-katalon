@Profile
Feature: Profile

@profile_Notifikasi_Nonaktif
Scenario: Pengguna sukses non-aktifkan settingan notifikasi 

Given Pengguna dihalaman Profile
When Pengguna menekan toggle notifikasi menjadi nonaktif 
Then Pengguna kembali ke halaman beranda

@profile_Notifikasi_Aktif
Scenario: Pengguna sukses non-aktifkan settingan notifikasi 

Given Pengguna dihalaman Profile
When Pengguna menekan toggle notifikasi menjadi aktif 
Then Pengguna kembali ke halaman beranda