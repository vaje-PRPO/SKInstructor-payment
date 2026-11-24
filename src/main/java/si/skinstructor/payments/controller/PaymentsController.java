package si.skinstructor.payments.controller;

import si.skinstructor.payments.api.PaymentsApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentsController implements PaymentsApi {

    @Override
    public ResponseEntity<Void> getHealth() {
        return ResponseEntity.ok().build();
    }
}
