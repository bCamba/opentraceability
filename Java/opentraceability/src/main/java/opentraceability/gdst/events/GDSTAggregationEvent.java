package opentraceability.gdst.events;

import opentraceability.Constants;
import opentraceability.models.events.AggregationEventBase;
import opentraceability.models.events.ObjectEventBase;
import opentraceability.models.events.TransformationEventBase;
import opentraceability.models.identifiers.PGLN;
import opentraceability.utility.attributes.*;

public class GDSTAggregationEvent extends AggregationEventBase<GDSTILMD> implements IGDSTEvent  {
    @OpenTraceabilityAttribute(ns=Constants.GDST_NAMESPACE, name="productOwner")
    @OpenTraceabilityJsonAttribute(name="gdst:productOwner")
    private PGLN productOwner;

    @Override
    public PGLN getProductOwner() {
        return this.productOwner;
    }

    // Add constructor, getters, and setters here
}

