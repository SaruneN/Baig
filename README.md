# Final work project
### Site used for testing
[TECHNITIS](https://www.technitis.lt/)
### Packages used
- TestNG `org.testng:testng`
- Selenium `org.seleniumhq.selenium:selenium-java`
- WebDriverManager `io.github.bonigarcia:webdrivermanager`

## Test Scenarios:
### 1. Login
#### Login with existing information
- Open page `https://www.technitis.lt/`;
- Click button `ĮRANKIAI`;
- Move mouse to menu `PRISIJUNGTI`;
- Click button `PRISIJUNGTI`;
- Enter existing email address into field *"El. paštas"*: ***testas.vcs@gmail.com***;
- Enter existing password into field *"Slaptažodis"*: ***VCSTestas***;
- Click button `PRISIJUNGTI`.

Expected result: Successfully login to account.

### 2. Logout
#### Logout by using existing information
- Open page `https://www.technitis.lt/`;
- Click button `ĮRANKIAI`;
- Move mouse to menu `PRISIJUNGTI`;
- Click button `PRISIJUNGTI`;
- Enter existing email address into field *"El. paštas"*: ***testas.vcs@gmail.com***;
- Enter existing password into field *"Slaptažodis"*: ***VCSTestas***;
- Click button `PRISIJUNGTI`;
- Move mouse to menu `MANO PASKYRA`;
- Click button `ATSIJUNGTI`.

Expected result: Successfully logout.

### 3. Change information in user profile
#### Change user name in user profile 
- Open page `https://www.technitis.lt/`;
- Click button `ĮRANKIAI`;
- Move mouse to menu `PRISIJUNGTI`;
- Click button `PRISIJUNGTI`;
- Enter existing email address into field *"El. paštas"*: ***testas.vcs@gmail.com***;
- Enter existing password into field *"Slaptažodis"*: ***VCSTestas***;
- Click button `PRISIJUNGTI`;
- Move mouse to menu `MANO PASKYRA`;
- Click button `MANO PASKYRA`;
- Click button `KEISTI PASKYROS INFORMACIJĄ`;
- Click on field *"Vardas"*;
- Select all text from field *"Vardas"* by pressing button "A" and "Ctrl" on keyboard at once;
- Click button "Delete" on keyboard;
- Enter new name into field *"Vardas"*: ***Testukas***;
- Click Button `TĘSTI`;

Expected result: Successfully change name.

### 4. Add to cart
#### Add one item to cart
- Open page `https://www.technitis.lt/`;
- Click button `ĮRANKIAI`;
- Click button `AKUMULIATORINIAI ĮRANKIAI`
- From menu `AKUMULIATORINIAI ĮRANKIAI` select `Akumuliatoriniai suktuvai`
- Click on `BOSCH` checkbox in filter *"Manufacturer"*;
- Click on item ***"
  BOSCH GDX 18V-200 C smūginis veržliasukis SOLO L-Boxx"***;
- Click button `Į KREPŠELĮ`.

Expected result: Item successfully added to cart.

### 5. Search 
#### Seach for exsinting information
- Open page `https://www.technitis.lt/`;
- Click button `ĮRANKIAI`;
- Click button `AKUMULIATORINIAI ĮRANKIAI`
- Click on search bar;
- Enter text: ***SOLO***;
- Click button `Search`.

Expected result: Items with text "SOLO" in name appears on window.
