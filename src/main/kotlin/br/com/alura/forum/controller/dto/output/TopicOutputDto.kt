package br.com.alura.forum.controller.dto.output

import br.com.alura.forum.model.topic.domain.Topic
import br.com.alura.forum.model.topic.domain.TopicStatus
import java.time.Instant

class TopicOutputDto(topic: Topic) {
    val id: Long? = topic.id
    val shortDescription: String = topic.shortDescription
    val content: String = topic.content
    val status: TopicStatus = topic.status
    val numberOfResponses: Int = topic.numberOfAnswers
    val creationInstant: Instant = topic.creationInstant
    val lastUpdate: Instant = topic.lastUpdate
    val ownerName: String = topic.owner.name
    val courseName: String = topic.course.name
    val subcategoryName: String = topic.course.subcategory.name
    val categoryName: String = topic.course.categoryName
    val answers: List<AnswerOutputDto> = AnswerOutputDto.listFromAnswers(topic.answers)
}