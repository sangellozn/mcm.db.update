package inf.san.mcm.db.update.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inf.san.mcm.db.update.service.IAdministrationService;

@RestController
@RequestMapping("api/admin")
public class AdministrationController {
	
	private final IAdministrationService administrationService;
	
	public AdministrationController(IAdministrationService administrationService) {
		this.administrationService = administrationService;
	}

	@PostMapping("db/update")
	public void updateDataBase() {
		administrationService.updateDataBase();
	}
	
}
