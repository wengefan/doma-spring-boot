package org.seasar.doma.boot;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MessageListener implements EntityListener<Message> {
	@Override
	public void preInsert(Message message, PreInsertContext<Message> context) {
		message.createdAt = LocalDate.now();
	}
}
