import Account from "./account";

class Plan {
    id: number;
    maxLines: number;
    price: number;
    account: Account;

    constructor(id = 0, maxLines = 0, price = 0.00, account = new Account()) {
        this.id = id;
        this.maxLines = maxLines;
        this.price = price;
        this.account = account;
    }
}
export default Plan