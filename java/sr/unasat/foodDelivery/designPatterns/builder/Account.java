package sr.unasat.foodDelivery.designPatterns.builder;

public class Account {

        private final String firstName;
        private final String lastName;
        private final String phone;
        private final String address;

        private Account(AccountBuilder builder) {
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.phone = builder.phone;
            this.address = builder.address;
        }

        // alleen getters voor immutibility
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public String getPhone() {
            return phone;
        }
        public String getAddress() {
            return address;
        }

        @Override
        public String toString() {
            return "User: " + '\n' +
                    this.firstName + '\n' +
                    this.lastName + '\n' +
                    this.phone + '\n' +
                    this.address;
        }

        public static class AccountBuilder {
            private final String firstName;
            private final String lastName;
            private String phone;
            private String address;

            public AccountBuilder(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }
            public AccountBuilder phone(String phone) {
                this.phone = phone;
                return this;
            }
            public AccountBuilder address(String address) {
                this.address = address;
                return this;
            }

            public Account build() {
                Account account =  new Account(this);
//                validateUserObject(account);
                return account;
            }
//            private void validateUserObject(Account account) {
//
//            }
        }
    }