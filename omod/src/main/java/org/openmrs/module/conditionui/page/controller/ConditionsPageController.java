/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.conditionui.page.controller;

import org.openmrs.Patient;
import org.openmrs.module.emrapi.conditionslist.ConditionService;
import org.openmrs.ui.framework.annotation.SpringBean;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller for a fragment that displays conditions for a patient
 * 
 * @author owais.hussain@ihsinformatics.com
 */
public class ConditionsPageController {
	
	public void controller(PageModel model, @RequestParam("patientId") Patient patient,
	        @SpringBean("conditionService") ConditionService service) {
		model.addAttribute("conditions", service.getConditionHistory(patient));
	}
}
