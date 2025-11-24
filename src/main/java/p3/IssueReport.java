package p3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IssueReport {
    private int openIssues;
    private int closedIssues;
}
