$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Features/UI.feature");
formatter.feature({
  "name": "Test UI",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@UITest"
    }
  ]
});
formatter.scenario({
  "name": "Add products to cart and purchase",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UITest"
    },
    {
      "name": "@Step1"
    },
    {
      "name": "@UITest"
    }
  ]
});
formatter.step({
  "name": "User opens the webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "UI.user_opens_the_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to category \"Laptops\"",
  "keyword": "And "
});
formatter.match({
  "location": "UI.navigate_to_category_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add products in cart",
  "rows": [
    {
      "cells": [
        "Sony vaio i5"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "UI.add_products_in_cart(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to category \"Laptops\"",
  "keyword": "And "
});
formatter.match({
  "location": "UI.navigate_to_category_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add products in cart",
  "rows": [
    {
      "cells": [
        "Dell i7 8gb"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "UI.add_products_in_cart(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to cart",
  "keyword": "When "
});
formatter.match({
  "location": "UI.user_navigates_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "deletes the product \"Sony vaio i5\"",
  "keyword": "And "
});
formatter.match({
  "location": "UI.deletes_the_product_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User places order",
  "keyword": "Then "
});
formatter.match({
  "location": "UI.user_places_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fetches order total in \"TotalAmount\"",
  "keyword": "And "
});
formatter.match({
  "location": "UI.user_fetches_order_total_in_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User completes the purchase",
  "rows": [
    {
      "cells": [
        "Name",
        "Test User"
      ]
    },
    {
      "cells": [
        "Country",
        "India"
      ]
    },
    {
      "cells": [
        "City",
        "Delhi"
      ]
    },
    {
      "cells": [
        "Credit Card",
        "4242424242424242"
      ]
    },
    {
      "cells": [
        "Month",
        "12"
      ]
    },
    {
      "cells": [
        "Year",
        "2025"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "UI.user_completes_the_purchase(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fetches purchase id \"PurchaseId\" and amount \"Amount\"",
  "keyword": "And "
});
formatter.match({
  "location": "UI.user_fetches_purchase_id_something_and_amount_something(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "compare \"Amount\" and \"TotalAmount\"",
  "keyword": "And "
});
formatter.match({
  "location": "UI.compare_something_and_something(String,String)"
});
formatter.result({
  "status": "passed"
});
});