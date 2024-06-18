package data.transfer.object;

import data.transfer.object.report.ReportDTO;

import java.util.Map;

public class VerificationProcessDTO {
    private int ID;
    private ReportDTO reportDTO;
    private Map<Integer, Integer> responsesMapByUserID;
}
