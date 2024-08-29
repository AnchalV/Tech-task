CREATE TABLE IF NOT EXISTS social_network_post (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    post_date DATE,
    post_category VARCHAR(255),
    author VARCHAR(255),
    content TEXT,
    view_count BIGINT
);