@Profile
Feature: Profile

@profile_gantiPin_sukses
Scenario: Halaman PIN Baru Tampil

Given Pengguna dihalaman Masukan PIN Lama
When Pengguna mengisi PIN Lama
And Pengguna mengisi PIN baru
Then Halaman PIN Baru tampil