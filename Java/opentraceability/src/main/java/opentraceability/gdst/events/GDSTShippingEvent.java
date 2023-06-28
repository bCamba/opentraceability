package opentraceability.gdst.events;

import opentraceability.Constants;
import opentraceability.models.events.ObjectEventBase;
import opentraceability.models.identifiers.PGLN;
import opentraceability.utility.attributes.OpenTraceabilityAttribute;
import opentraceability.utility.attributes.OpenTraceabilityJsonAttribute;

public class GDSTShippingEvent extends ObjectEventBase<GDSTILMD> implements IGDSTEvent {
    @OpenTraceabilityAttribute(ns = Constants.GDST_NAMESPACE, name = "productOwner")
    @OpenTraceabilityJsonAttribute(name = "gdst:productOwner")
    private PGLN productOwner;

    @Override
    public PGLN getProductOwner() {
        return this.productOwner;
    }

    @OpenTraceabilityAttribute(ns = Constants.GDST_NAMESPACE, name = "humanWelfarePolicy")
    @OpenTraceabilityJsonAttribute(name = "gdst:humanWelfarePolicy")
    private String humanWelfarePolicy;

    // Add constructor, getters, and setters here
}
