package org.nanotek.talisma.service;

import org.nanotek.talisma.base.model.App;
import org.springframework.validation.annotation.Validated;


@Validated
public interface AppBaseService 
extends CrudBaseService<App,String>{
}
