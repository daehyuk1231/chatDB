package com.ll.chatDB.global.utill;

import lombok.SneakyThrows;

public class Ut {
    public static class thread {

        @SneakyThrows
        public static void sleep(int milli) {
            Thread.sleep(milli);
        }
    }
}
