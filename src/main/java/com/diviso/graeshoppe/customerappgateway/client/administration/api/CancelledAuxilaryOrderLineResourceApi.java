/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.customerappgateway.client.administration.api;

import com.diviso.graeshoppe.customerappgateway.client.administration.model.CancelledAuxilaryOrderLineDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-27T14:13:06.209+05:30[Asia/Kolkata]")

@Api(value = "CancelledAuxilaryOrderLineResource", description = "the CancelledAuxilaryOrderLineResource API")
public interface CancelledAuxilaryOrderLineResourceApi {

    @ApiOperation(value = "createCancelledAuxilaryOrderLine", nickname = "createCancelledAuxilaryOrderLineUsingPOST", notes = "", response = CancelledAuxilaryOrderLineDTO.class, tags={ "cancelled-auxilary-order-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CancelledAuxilaryOrderLineDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/cancelled-auxilary-order-lines",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<CancelledAuxilaryOrderLineDTO> createCancelledAuxilaryOrderLineUsingPOST(@ApiParam(value = "cancelledAuxilaryOrderLineDTO" ,required=true )  @Valid @RequestBody CancelledAuxilaryOrderLineDTO cancelledAuxilaryOrderLineDTO);


    @ApiOperation(value = "deleteCancelledAuxilaryOrderLine", nickname = "deleteCancelledAuxilaryOrderLineUsingDELETE", notes = "", tags={ "cancelled-auxilary-order-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/cancelled-auxilary-order-lines/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCancelledAuxilaryOrderLineUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllCancelledAuxilaryOrderLines", nickname = "getAllCancelledAuxilaryOrderLinesUsingGET", notes = "", response = CancelledAuxilaryOrderLineDTO.class, responseContainer = "List", tags={ "cancelled-auxilary-order-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CancelledAuxilaryOrderLineDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/cancelled-auxilary-order-lines",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<CancelledAuxilaryOrderLineDTO>> getAllCancelledAuxilaryOrderLinesUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getCancelledAuxilaryOrderLine", nickname = "getCancelledAuxilaryOrderLineUsingGET", notes = "", response = CancelledAuxilaryOrderLineDTO.class, tags={ "cancelled-auxilary-order-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CancelledAuxilaryOrderLineDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/cancelled-auxilary-order-lines/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<CancelledAuxilaryOrderLineDTO> getCancelledAuxilaryOrderLineUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchCancelledAuxilaryOrderLines", nickname = "searchCancelledAuxilaryOrderLinesUsingGET", notes = "", response = CancelledAuxilaryOrderLineDTO.class, responseContainer = "List", tags={ "cancelled-auxilary-order-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CancelledAuxilaryOrderLineDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/cancelled-auxilary-order-lines",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<CancelledAuxilaryOrderLineDTO>> searchCancelledAuxilaryOrderLinesUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateCancelledAuxilaryOrderLine", nickname = "updateCancelledAuxilaryOrderLineUsingPUT", notes = "", response = CancelledAuxilaryOrderLineDTO.class, tags={ "cancelled-auxilary-order-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CancelledAuxilaryOrderLineDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/cancelled-auxilary-order-lines",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<CancelledAuxilaryOrderLineDTO> updateCancelledAuxilaryOrderLineUsingPUT(@ApiParam(value = "cancelledAuxilaryOrderLineDTO" ,required=true )  @Valid @RequestBody CancelledAuxilaryOrderLineDTO cancelledAuxilaryOrderLineDTO);

}
