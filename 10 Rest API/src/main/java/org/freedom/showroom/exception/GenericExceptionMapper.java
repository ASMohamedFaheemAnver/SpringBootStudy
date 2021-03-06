package org.freedom.showroom.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.freedom.showroom.model.ErrorPayload;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable exception) {
		ErrorPayload error = new ErrorPayload(500, "Internal server error!");
		System.out.println(exception);
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(error).build();
	}

}
