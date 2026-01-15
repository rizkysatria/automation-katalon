@Profile
Feature: Profile

@profile_GantiBahasaInggris
Scenario: Pengguna dapat mengganti tampilan bahasa

Given Pengguna dihalaman Profile
When Pengguna menekan tombol EN ID dari bahasa indonesia 
Then Pengguna kembali ke halaman beranda

@profile_GantiBahasaIndonesia
Scenario: Pengguna dapat mengganti tampilan bahasa

Given Pengguna dihalaman Profile
When Pengguna menekan tombol EN ID dari bahasa inggris 
Then Pengguna kembali ke halaman beranda