<h style="text-align:center">

## Automation tests for www.douglas.lt
</h>

#### Link to the page - [www.douglas.lt](https://www.douglas.lt)
### Test cases
***
<p style="color: green">
1. Login to account with correct information: <br> douglas.lt

***


- Open www.douglas.lt page
- Close "Slapukų informacija" window by clicking on "Sutinku su visai" button;
- Click "Prisijungti" reference;
- Wait till login page will be shown;
- Put right email address to login email input field;
- Put right password to login password input field;
- Click "Prisijungti" button;

___Expected result:___  Login is successful and login mark is appeared.
***
<p style="color: green">
2. Login to account with false information: <br> douglas.lt

***


- Open www.douglas.lt page
- Close "Slapukų informacija" window by clicking on "Sutinku su visai" button;
- Click "Prisijungti" reference;
- Wait till login page will be shown;
- Put false email address to login email input field;
- Put false password to login password input field;
- Click "Prisijungti" button;

___Expected result:___  Read input information and compare it with true information.

***
 <p style="color: green">
3. Put product to the cart: <br> douglas.lt ->www.douglas.lt/prekiu-zenklai/ -> douglas.lt/chanel -> douglas.lt/katalogas/chanel-coco-mademoiselle-intense-2/

***
</p>

- Open www.douglas.lt page
- Close "Slapukų informacija" window by clicking on "Sutinku su visai" button;
- Click on "Prekių ženklai";
- Place cursor on Chanel brand and click it;
- Place hover on product "CHANEL COCO MADEMOISELLE" and click it;
- Click radio button with quantity of product "50ml";
- Click on button "Į KREPŠELĮ";
- Click on bag icon in the top of the page;
- Check if correct product, correct size added to cart;

___Expected result:___ Selected product will be added to cart.

***
<p style="color: green">
4. Choosing the sample: <br> douglas.lt/mano-duomenys/prekiu-krepselis/

***
</p>

- Click "Rinktis" reference;
- Wait till sample's page will be shown;
- Check the checkbox;
- Click "PRIDĖTI PAŽYMĖTUS MĖGINIUS" button;
- Check if correct sample added to cart;

___Expected result:___ Chosen sample should be added to cart.

***
<p style="color: green">
5. Add gift wrapping to cart : <br> douglas.lt/mano-duomenys/prekiu-krepselis/

***
</p>

- Click "Nemokamas dovanos pakavimas" reference;
- Wait till gift wrapping page will be shown;
- Check checkbox of the product;
- Fill comment field;
- Click "PRIDĖTI PAKAVIMĄ" button;

___Expected result:___ Gift wrapping should be added to cart.

***
<p style="color: green">
6. Add greeting card to cart : <br> douglas.lt/mano-duomenys/prekiu-krepselis/

***
</p>

- Click "Nemokama atvirutė" reference;
- Wait till gift wrapping page will be shown;
- Choose the card;
- Fill greeting field;
- Click "PRIDĖTI ATVIRUTĘ" button;

___Expected result___ Gift card should be added to cart.

***
<p style="color: green">
7. Checkout: <br> douglas.lt/mano-duomenys/prekiu-krepselis/ -> douglas.lt/mano-duomenys/prekiu-krepselis/checkout/ -> douglas.lt/mano-duomenys/uzsakymai/*****/atliktas/

***
</p>

- Click "TĘSTI" button;
- Click radio button "DOUGLAS parduotuvėje";
- Click on field "Parduotuvė";
- Choose teh shop and click on it;
- Click radio button "Išankstiniu pavedimu";
- Read the message "Šį mokėjimo būdą rinkitės tuo atveju, jeigu norite apmokėti paprastu bankiniu pavedimu."
- Check the agreement with the rules checkbox "Patvirtinu, kad susipažinau ir sutinku su taisyklėmis";
- Click "UŽSAKYTI" button;
- Read the message "Sveikiname sėkmingai apsipirkus!";

___Expected result:___ Order accepted.

***
<p style="color: green">
Tests made by: 

</p>

Lina: [Github](https://github.com/linajja)
***
