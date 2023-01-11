package ru.students.labprog_REST_copy.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.students.labprog_REST_copy.model.Response;

@Service
@Qualifier("ModifyUid")
public class ModifyUid implements MyModifyService {
    @Override
    public Response modify(Response response) {
        response.setUid("New Uid");
        return response;
    }
}
