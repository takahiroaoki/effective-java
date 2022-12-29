package chap4.item24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group {
    private List<Member> memberList;

    // 状態を持つ必要がない処理などはstaticメンバーにしておく。
    private static class Utils {
        private static Member selectOneAtRandom(List<Member> list) {
            Collections.shuffle(list);
            return list.get(0);
        }
    }

    private Group() {
        this.memberList = new ArrayList<>();
    }

    public static Group newInstance() {
        return new Group();
    }

    public Group add(Member m) {
        this.memberList.add(m);
        return this;
    }

    public Member selectOneMemberAtRandom() {
        return Utils.selectOneAtRandom(memberList);
    }

}
