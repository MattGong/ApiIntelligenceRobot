package services.utils.swagger.core.config;


import services.utils.swagger.core.filter.SwaggerSpecFilter;

public class FilterFactory {
    protected static SwaggerSpecFilter FILTER = null;

    public static SwaggerSpecFilter getFilter() {
        return FILTER;
    }

    public static void setFilter(SwaggerSpecFilter filter) {
        FILTER = filter;
    }
}