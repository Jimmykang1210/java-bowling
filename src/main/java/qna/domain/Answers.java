package qna.domain;

import qna.CannotDeleteException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Answers {
    private static final String EXCEPTION_MESSAGE_OTHER_PERSON_ANSWER_EXIST = "다른 사람이 쓴 답변이 있어 삭제할 수 없습니다.";

    private final List<Answer> answers;

    public Answers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<DeleteHistory> getDeleteHistories(User loginUser, Question question, LocalDateTime createTime) throws CannotDeleteException {
        validateAnswersDeleted(loginUser);
        return answersDeleteHistories(question.getDeleteHistory(createTime), createTime);
    }

    private List<DeleteHistory> answersDeleteHistories(DeleteHistory deleteQuestionHistory, LocalDateTime createTime) {
        List<DeleteHistory> deleteHistories = new ArrayList<>();
        deleteHistories.add(deleteQuestionHistory);
        answers.stream()
                    .forEach(answer -> deleteHistories.add(answer.getDeleteHistory(createTime)));
        return deleteHistories;
    }

    private void validateAnswersDeleted(User loginUser) throws CannotDeleteException {
        if (!isOwner(loginUser)) {
            throw new CannotDeleteException(EXCEPTION_MESSAGE_OTHER_PERSON_ANSWER_EXIST);
        }
    }

    private boolean isOwner(User loginUser) {
        return answers.stream()
                            .allMatch(answer -> answer.isOwner(loginUser));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answers answers1 = (Answers) o;
        return Objects.equals(answers, answers1.answers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answers);
    }
}
