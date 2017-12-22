/**
 This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.conditionui.page.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Patient;
import org.openmrs.ui.framework.UiUtils;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller for a fragment that displays conditions for a patient
 * 
 * @author owais.hussain@ihsinformatics.com
 */
public class ManageconditionsPageController {
	
	protected final Log log = LogFactory.getLog(getClass());
	
	public void controller(PageModel model, @RequestParam("patientId") Patient patient,
	        @RequestParam(value = "returnUrl", required = false) String returnUrl, UiUtils ui) {
		if (StringUtils.isBlank(returnUrl)) {
			returnUrl = ui.pageLink("coreapps", "clinicianfacing/patient",
			    Collections.singletonMap("patientId", (Object) patient.getId()));
		}
		
		model.addAttribute("patient", patient);
		model.addAttribute("returnUrl", returnUrl);
	}
}
