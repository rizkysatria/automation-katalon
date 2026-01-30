Feature: Detail Tabungan

@Beranda_LihatSemua_PilihTabungan_VisaKonven
Scenario Outline: Menampilkan informasi tabungan berdasarkan jenis kartu (Visa Konven)

Given Pengguna berada di halaman Akun Anda
When Pengguna pilih tabungan dengan jenis kartu "<jenis_kartu>" pada listing tabungan 
Then sistem menampilkan informasi tabungan sesuai dengan jenis kartu "<jenis_kartu>"

@visa_only
Examples:
| jenis_kartu |
| Visa Konven |
| Visa Konven Platinum |

@gpn_only
Examples:
| jenis_kartu |
| GPN |
| GPN Platinum |

@kartu_jakarta_only
Examples:
| jenis_kartu |
| Kartu Jakarta |

@all_cards
Examples:
| jenis_kartu |
| Visa Syariah |
| Visa Syariah Platinum |
| GPN Syariah |
| GPN Syariah Gold |
| GPN Syariah Platinum |
| Kartu Jakarta |