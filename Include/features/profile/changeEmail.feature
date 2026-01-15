@Profile
Feature: Profile

@profile_GantiEmail_Sukses
Scenario: Pengguna dapat mengganti email yang terdaftar pada aplikasi dengan email baru

Given Pengguna dihalaman Profile
When Pengguna menekan Email section 
And Pengguna memasukan email baru
And Pengguna memasukan OTP
And Pengguna Memasukan PIN
Then Email berhasil di ubah popup tampil
And Pengguna kembali ke halaman beranda"