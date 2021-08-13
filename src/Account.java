public class Account {
	String accountNumber;
	int balance;
	
	public String toStrong() {
		return "¥¥" + this.balance + "（口座番号：" + this.accountNumber + ")";
	}
	public boolean equals(Object o) {
		if (this == o) { return true; }
		if (o instanceof Account) {
			Account a = (Account) o;
//			String an1 = this.accountNumber.trim();
//			String an2 = accountNumber.trim();
//			if (an1.equals(an2))
			if (this.accountNumber.trim().equals(a.accountNumber.trim())) {
				return true;
			}
		}
		return false;
	}
	
}
