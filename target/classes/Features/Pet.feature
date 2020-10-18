@PetTest
Feature: Get available pets

  @Step1
  Scenario Outline: Verify available pets
    Given User has the endpoint "ENDPOINT_GET_PET_BY_STATUS"
    When User hit the "GET" request
      | Content-type | application/json |          |
      | query-param  | status           | <status> |
    Then User verifies the status code as <statusCode>
    And User validates the "<status>" value in jsonArray path "<path>"
    Examples:
      | statusCode | status    | path    |
      | 200        | available | .status |

  @Step2
  Scenario Outline: Add new pet
    Given User has the endpoint "ENDPOINT_ADD_PET"
    And User sets the request body "AddPet"
    And User alters json "AddPet"
      | name | TestPet |
    When User hit the "POST" request
      | Content-type | application/json |  |
    Then User verifies the status code as <statusCode>
    And User fetches the json values
      | <petId> | id |
    Given User has the endpoint "ENDPOINT_GET_UPDATE_DELETE_PET"
    When User hit the "GET" request
      | Content-type | application/json |         |
      | path-param   | petId            | <petId> |
    Then User verifies the status code as <statusCode>
    And User validates the JsonResponse
      | id | <petId> |

    Examples:
      | statusCode | petId |
      | 200        | petId |

  @Step3
  Scenario Outline: Update pet status
    Given User has the endpoint "ENDPOINT_GET_UPDATE_DELETE_PET"
    When User hit the "POST" request
      | Content-type | application/x-www-form-urlencoded |          |
      | path-param   | petId                             | <petId>  |
      | form-param   | name                              | <name>   |
      | form-param   | status                            | <status> |
    Then User verifies the status code as <statusCode>
    Given User has the endpoint "ENDPOINT_GET_UPDATE_DELETE_PET"
    When User hit the "GET" request
      | Content-type | application/json |         |
      | path-param   | petId            | <petId> |
    Then User verifies the status code as <statusCode>
    And User validates the JsonResponse
      | id     | <petId>  |
      | status | <status> |
    Examples:
      | statusCode | petId | name       | status |
      | 200        | petId | TestChange | sold   |

  @Step4
  Scenario Outline: Delete pet
    Given User has the endpoint "ENDPOINT_GET_UPDATE_DELETE_PET"
    When User hit the "DELETE" request
      | Content-type | application/json |             |
      | path-param   | petId            | <petId>     |
      | Header       | api_key          | special-key |
    Then User verifies the status code as <statusCode>
    Given User has the endpoint "ENDPOINT_GET_UPDATE_DELETE_PET"
    When User hit the "GET" request
      | Content-type | application/json |         |
      | path-param   | petId            | <petId> |
    Then User verifies the status code as <statusCodeGet>
    Examples:
      | statusCode | petId | statusCodeGet |
      | 200        | petId | 404           |

