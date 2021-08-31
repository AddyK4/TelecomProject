import Plan from "./Plan";

class Account {
    id: number;
    email: string;
    password: string;
    plans: Plan[];

    constructor(id = 0, email = "", password = "", plans = []) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.plans = plans;
    }
}
export default Account;