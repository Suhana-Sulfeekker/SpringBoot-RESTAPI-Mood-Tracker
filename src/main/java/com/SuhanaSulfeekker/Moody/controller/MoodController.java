package com.SuhanaSulfeekker.Moody.controller;

import com.SuhanaSulfeekker.Moody.model.MoodEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/moods")
public class MoodController {

    private List<MoodEntry> moodList = new ArrayList<>();
    private int currentId = 1;

    // POST - Add mood
    @PostMapping
    public MoodEntry addMood(@RequestBody MoodEntry mood) {
        mood.setId(currentId++);
        moodList.add(mood);
        return mood;
    }

    // GET - List all moods
    @GetMapping
    public List<MoodEntry> getAllMoods() {
        return moodList;
    }

    // PUT - Update mood by ID
    @PutMapping("/{id}")
    public MoodEntry updateMood(@PathVariable int id, @RequestBody MoodEntry updatedMood) {
        for (MoodEntry mood : moodList) {
            if (mood.getId() == id) {
                mood.setDate(updatedMood.getDate());
                mood.setMood(updatedMood.getMood());
                return mood;
            }
        }
        return null;
    }

    // DELETE - Delete mood by ID
    @DeleteMapping("/{id}")
    public String deleteMood(@PathVariable int id) {
        moodList.removeIf(mood -> mood.getId() == id);
        return "Deleted mood with ID: " + id;
    }
}
