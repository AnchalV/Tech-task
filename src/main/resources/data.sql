-- Insert data into social_network_post table
INSERT INTO social_network_post (post_date, post_category, author, content, view_count) VALUES
('2024-01-15', 'Music', 'Alice', 'Check out my new song!', 1570),
('2024-02-22', 'Gaming', 'Bob', 'Just finished an epic gaming session!', 2215),
('2024-03-10', 'News', 'Charlie', 'Breaking news: Major event happening now!', 3050),
('2024-04-18', 'Entertainment', 'Diana', 'Top 10 movies to watch this summer.', 1725),
('2024-05-05', 'Music', 'Eve', 'My concert was amazing last night!', 2850),
('2024-06-23', 'Gaming', 'Frank', 'Tips and tricks for the latest game.', 2380),
('2024-07-01', 'News', 'Grace', 'Election results are in.', 3190),
('2024-08-14', 'Entertainment', 'Heidi', 'Best TV shows to binge-watch.', 1920),
('2024-09-09', 'Music', 'Ivan', 'Album release date announced!', 2125),
('2024-10-25', 'Gaming', 'Judy', 'Game review: The best and the worst.', 2480),
('2024-11-11', 'News', 'Karl', 'Weather update: Severe storm approaching.', 2730),
('2024-12-05', 'Entertainment', 'Laura', 'Celebrity gossip: Who wore it best?', 1650),
('2024-01-20', 'Music', 'Mallory', 'Join me live for a music session.', 2340),
('2024-02-14', 'Gaming', 'Nina', 'Top 5 games to play this month.', 2650),
('2024-03-18', 'News', 'Oscar', 'Tech news: Latest gadget reviews.', 3130),
('2024-04-27', 'Entertainment', 'Paul', 'Must-see theater performances.', 1840),
('2024-05-30', 'Music', 'Quinn', 'New single dropping soon!', 2910),
('2024-06-15', 'Gaming', 'Rita', 'Livestreaming my gameplay now!', 2320),
('2024-07-23', 'News', 'Sam', 'Local news: Community event highlights.', 2690),
('2024-08-10', 'Entertainment', 'Tina', 'Behind the scenes of my latest video.', 2025);

-- Create indexes for optimized querying
CREATE INDEX idx_post_category ON social_network_post (post_category);
CREATE INDEX idx_view_count ON social_network_post (view_count);
CREATE INDEX idx_author ON social_network_post (author);
