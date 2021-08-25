import Plan from "./plan";

class Device {
    id: number;
    phoneNumber: string;
    deviceName: string;
    plan: Plan;

    constructor(id = 0, phoneNumber = "", deviceName = "", plan = new Plan()) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.deviceName = deviceName;
        this.plan = plan;
    }
}
export default Device;