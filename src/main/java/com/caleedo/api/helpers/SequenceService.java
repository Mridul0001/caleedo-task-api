package com.caleedo.api.helpers;

import org.springframework.stereotype.Service;

@Service
public interface SequenceService {
    int getSequence(String sequenceName);
}