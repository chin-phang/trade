create table `orders` (
    `order_id` integer auto_increment not null,
    `credit_card_number` varchar(20) not null,
    `order_date_time` timestamp not null,
    `order_location` varchar(200) not null,
    `order_number` varchar(20) not null,
    primary key (`order_id`)
) ENGINE=InnoDB;

create table `order_items` (
    `order_item_id` integer auto_increment not null,
    `item_name` varchar(200) not null,
    `price` integer not null,
    `quantity` integer not null,
    `order_id` integer not null,
    primary key (`order_item_id`)
) ENGINE=InnoDB;