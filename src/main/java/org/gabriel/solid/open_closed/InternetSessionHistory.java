package org.gabriel.solid.open_closed;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
public class InternetSessionHistory {
    public static class InternetSession {
        private final LocalDateTime begin;
        private final Long subscriberId;
        private final Long dataUsed;

        public InternetSession(Long subscriberId, LocalDateTime begin, Long dataUsed) {
            this.begin = begin;
            this.subscriberId = subscriberId;
            this.dataUsed = dataUsed;
        }
        public LocalDateTime getBegin() {
            return begin;
        }
        public Long getSubscriberId() {
            return subscriberId;
        }
        public Long getDataUsed() {
            return dataUsed;
        }
    }

    private static final Map<Long, List<InternetSession>> SESSIONS = new HashMap<>();

    public synchronized static List<InternetSession> getCurrentSessions(Long subscriberId) {
        if(!SESSIONS.containsKey(subscriberId))
            return Collections.emptyList();
        return SESSIONS.get(subscriberId);
    }

    public synchronized static void addSession(Long subscriberId, LocalDateTime begin,
                                               long dataUsed) {
        List<InternetSession> sessions;
        if(!SESSIONS.containsKey(subscriberId)) {
            sessions = new LinkedList<>();
            SESSIONS.put(subscriberId, sessions);
        } else {
            sessions = SESSIONS.get(subscriberId);
        }
        sessions.add(new InternetSession(subscriberId, begin, dataUsed));
    }
}
