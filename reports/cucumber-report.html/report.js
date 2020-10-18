$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Features/Pet.feature");
formatter.feature({
  "name": "Get available pets",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PetTest"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify available pets",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Step1"
    }
  ]
});
formatter.step({
  "name": "User has the endpoint \"ENDPOINT_GET_PET_BY_STATUS\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User hit the \"GET\" request",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "Content-type",
        "application/json",
        ""
      ]
    },
    {
      "cells": [
        "query-param",
        "status",
        "\u003cstatus\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "User verifies the status code as \u003cstatusCode\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "User validates the \"\u003cstatus\u003e\" value in jsonArray path \"\u003cpath\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "statusCode",
        "status",
        "path"
      ]
    },
    {
      "cells": [
        "200",
        "available",
        ".status"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify available pets",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PetTest"
    },
    {
      "name": "@Step1"
    }
  ]
});
formatter.step({
  "name": "User has the endpoint \"ENDPOINT_GET_PET_BY_STATUS\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Pet.user_has_the_endpoint_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hit the \"GET\" request",
  "rows": [
    {
      "cells": [
        "Content-type",
        "application/json",
        ""
      ]
    },
    {
      "cells": [
        "query-param",
        "status",
        "available"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Pet.user_hit_the_something_request(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies the status code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "Pet.user_verifies_the_status_code_as(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validates the \"available\" value in jsonArray path \".status\"",
  "keyword": "And "
});
formatter.match({
  "location": "Pet.user_validates_the_something_value_in_jsonarray_path_something(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Add new pet",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Step2"
    }
  ]
});
formatter.step({
  "name": "User has the endpoint \"ENDPOINT_ADD_PET\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User sets the request body \"AddPet\"",
  "keyword": "And "
});
formatter.step({
  "name": "User alters json \"AddPet\"",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "name",
        "TestPet"
      ]
    }
  ]
});
formatter.step({
  "name": "User hit the \"POST\" request",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "Content-type",
        "application/json",
        ""
      ]
    }
  ]
});
formatter.step({
  "name": "User verifies the status code as \u003cstatusCode\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "User fetches the json values",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "\u003cpetId\u003e",
        "id"
      ]
    }
  ]
});
formatter.step({
  "name": "User has the endpoint \"ENDPOINT_GET_UPDATE_DELETE_PET\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User hit the \"GET\" request",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "Content-type",
        "application/json",
        ""
      ]
    },
    {
      "cells": [
        "path-param",
        "petId",
        "\u003cpetId\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "User verifies the status code as \u003cstatusCode\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "User validates the JsonResponse",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "id",
        "\u003cpetId\u003e"
      ]
    }
  ]
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "statusCode",
        "petId"
      ]
    },
    {
      "cells": [
        "200",
        "petId"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Add new pet",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PetTest"
    },
    {
      "name": "@Step2"
    }
  ]
});
formatter.step({
  "name": "User has the endpoint \"ENDPOINT_ADD_PET\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Pet.user_has_the_endpoint_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sets the request body \"AddPet\"",
  "keyword": "And "
});
formatter.match({
  "location": "Pet.user_sets_the_request_body_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User alters json \"AddPet\"",
  "rows": [
    {
      "cells": [
        "name",
        "TestPet"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Pet.user_alters_json_something(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hit the \"POST\" request",
  "rows": [
    {
      "cells": [
        "Content-type",
        "application/json",
        ""
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Pet.user_hit_the_something_request(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies the status code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "Pet.user_verifies_the_status_code_as(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fetches the json values",
  "rows": [
    {
      "cells": [
        "petId",
        "id"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Pet.user_fetches_the_json_values(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has the endpoint \"ENDPOINT_GET_UPDATE_DELETE_PET\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Pet.user_has_the_endpoint_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hit the \"GET\" request",
  "rows": [
    {
      "cells": [
        "Content-type",
        "application/json",
        ""
      ]
    },
    {
      "cells": [
        "path-param",
        "petId",
        "petId"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Pet.user_hit_the_something_request(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies the status code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "Pet.user_verifies_the_status_code_as(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validates the JsonResponse",
  "rows": [
    {
      "cells": [
        "id",
        "petId"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Pet.user_validates_the_jsonresponse(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Update pet status",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Step3"
    }
  ]
});
formatter.step({
  "name": "User has the endpoint \"ENDPOINT_GET_UPDATE_DELETE_PET\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User hit the \"POST\" request",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "Content-type",
        "application/x-www-form-urlencoded",
        ""
      ]
    },
    {
      "cells": [
        "path-param",
        "petId",
        "\u003cpetId\u003e"
      ]
    },
    {
      "cells": [
        "form-param",
        "name",
        "\u003cname\u003e"
      ]
    },
    {
      "cells": [
        "form-param",
        "status",
        "\u003cstatus\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "User verifies the status code as \u003cstatusCode\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "User has the endpoint \"ENDPOINT_GET_UPDATE_DELETE_PET\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User hit the \"GET\" request",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "Content-type",
        "application/json",
        ""
      ]
    },
    {
      "cells": [
        "path-param",
        "petId",
        "\u003cpetId\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "User verifies the status code as \u003cstatusCode\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "User validates the JsonResponse",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "id",
        "\u003cpetId\u003e"
      ]
    },
    {
      "cells": [
        "status",
        "\u003cstatus\u003e"
      ]
    }
  ]
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "statusCode",
        "petId",
        "name",
        "status"
      ]
    },
    {
      "cells": [
        "200",
        "petId",
        "TestChange",
        "sold"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Update pet status",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PetTest"
    },
    {
      "name": "@Step3"
    }
  ]
});
formatter.step({
  "name": "User has the endpoint \"ENDPOINT_GET_UPDATE_DELETE_PET\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Pet.user_has_the_endpoint_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hit the \"POST\" request",
  "rows": [
    {
      "cells": [
        "Content-type",
        "application/x-www-form-urlencoded",
        ""
      ]
    },
    {
      "cells": [
        "path-param",
        "petId",
        "petId"
      ]
    },
    {
      "cells": [
        "form-param",
        "name",
        "TestChange"
      ]
    },
    {
      "cells": [
        "form-param",
        "status",
        "sold"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Pet.user_hit_the_something_request(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies the status code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "Pet.user_verifies_the_status_code_as(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has the endpoint \"ENDPOINT_GET_UPDATE_DELETE_PET\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Pet.user_has_the_endpoint_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hit the \"GET\" request",
  "rows": [
    {
      "cells": [
        "Content-type",
        "application/json",
        ""
      ]
    },
    {
      "cells": [
        "path-param",
        "petId",
        "petId"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Pet.user_hit_the_something_request(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies the status code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "Pet.user_verifies_the_status_code_as(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validates the JsonResponse",
  "rows": [
    {
      "cells": [
        "id",
        "petId"
      ]
    },
    {
      "cells": [
        "status",
        "sold"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Pet.user_validates_the_jsonresponse(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Delete pet",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Step4"
    }
  ]
});
formatter.step({
  "name": "User has the endpoint \"ENDPOINT_GET_UPDATE_DELETE_PET\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User hit the \"DELETE\" request",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "Content-type",
        "application/json",
        ""
      ]
    },
    {
      "cells": [
        "path-param",
        "petId",
        "\u003cpetId\u003e"
      ]
    },
    {
      "cells": [
        "Header",
        "api_key",
        "special-key"
      ]
    }
  ]
});
formatter.step({
  "name": "User verifies the status code as \u003cstatusCode\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "User has the endpoint \"ENDPOINT_GET_UPDATE_DELETE_PET\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User hit the \"GET\" request",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "Content-type",
        "application/json",
        ""
      ]
    },
    {
      "cells": [
        "path-param",
        "petId",
        "\u003cpetId\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "User verifies the status code as \u003cstatusCodeGet\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "statusCode",
        "petId",
        "statusCodeGet"
      ]
    },
    {
      "cells": [
        "200",
        "petId",
        "404"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Delete pet",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PetTest"
    },
    {
      "name": "@Step4"
    }
  ]
});
formatter.step({
  "name": "User has the endpoint \"ENDPOINT_GET_UPDATE_DELETE_PET\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Pet.user_has_the_endpoint_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hit the \"DELETE\" request",
  "rows": [
    {
      "cells": [
        "Content-type",
        "application/json",
        ""
      ]
    },
    {
      "cells": [
        "path-param",
        "petId",
        "petId"
      ]
    },
    {
      "cells": [
        "Header",
        "api_key",
        "special-key"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Pet.user_hit_the_something_request(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies the status code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "Pet.user_verifies_the_status_code_as(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has the endpoint \"ENDPOINT_GET_UPDATE_DELETE_PET\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Pet.user_has_the_endpoint_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hit the \"GET\" request",
  "rows": [
    {
      "cells": [
        "Content-type",
        "application/json",
        ""
      ]
    },
    {
      "cells": [
        "path-param",
        "petId",
        "petId"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Pet.user_hit_the_something_request(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies the status code as 404",
  "keyword": "Then "
});
formatter.match({
  "location": "Pet.user_verifies_the_status_code_as(int)"
});
formatter.result({
  "status": "passed"
});
});